/**
 * Projeto final da Disciplina Compiladores - Linguagem C+-
 * @author David, Gabriela, Leonardo, Luiz H, 
 * @version 1.0
 */
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

// java -jar antlr-4.13.1-complete.jar Grammar.g4 para gerar o  

import java.io.IOException;

public class App {

    public static void  main (String[] args){
        String filename = "src\\algoritimos\\imprimeNumPares.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            CmzmLangLexer lexer = new CmzmLangLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}