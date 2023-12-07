import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class App {

    public static void main(String[] args) {
        String filename = "src\\algoritimos\\imprimeNumPares.txt";

        try {
            // Análise léxica
            analiseLexica(filename, "src\\lexer_output.txt");

            // Análise sintática e semântica
            analiseSintaticaSemantica(filename, "src\\parser_output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void analiseLexica(String filename, String outputFilename) throws IOException {
        CharStream input = CharStreams.fromFileName(filename);

        // Criar arquivo para a saída do analisador léxico
        PrintStream lexOutput = new PrintStream(new FileOutputStream(outputFilename));
        System.setOut(lexOutput);

        CmzmLangLexer lexer = new CmzmLangLexer(input);

        // Realizar análise léxica
        Token token;
        while (!lexer._hitEOF) {
            token = lexer.nextToken();
            System.out.println("Token: " + token.toString());
            System.out.println("    Lexema: " + token.getText());
            System.out.println("    Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
        }

        // Restaurar a saída padrão
        System.setOut(System.out);
    }

    private static void analiseSintaticaSemantica(String filename, String outputFilename) throws IOException {
        CharStream input = CharStreams.fromFileName(filename);

        // Criar arquivo para a saída do analisador sintático
        PrintStream syntaxOutput = new PrintStream(new FileOutputStream(outputFilename));
        System.setOut(syntaxOutput);

        CmzmLangLexer lexer = new CmzmLangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CmzmLangParser parser = new CmzmLangParser(tokens);

        // Adicionar o ouvinte de erro ao parser
        parser.removeErrorListeners(); // Remover ouvintes padrão
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                System.err.println("Erro sintático na linha " + line + ", posição " + charPositionInLine + ": " + msg);
            }
        });

        // Iniciar a análise sintática
        ParseTree ast = parser.procedimento(); // Substituir "programa" pela regra inicial apropriada

        // Adicionar o ouvinte semântico
        ParseTreeWalker walker = new ParseTreeWalker();
        Semantico semantico = new Semantico();
        walker.walk(semantico, ast);

        //Imprimir a árvore
        System.out.println("Árvore Sintática:");
        System.out.println(ast.toStringTree());

        // Restaurar a saída padrão
        System.setOut(System.out);
    }
}
