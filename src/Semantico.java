import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;

public class Semantico extends CmzmLangBaseListener {
    private Set<String> variaveisDeclaradas = new HashSet<>();
    private List<String> errosSemanticos = new ArrayList<>();

      public List<String> getErrosSemanticos() {
        return errosSemanticos;
    }

    public boolean houveErrosSemanticos() {
        return !errosSemanticos.isEmpty();
    }

    // Método para adicionar mensagens de erro semântico
    private void adicionarErroSemantico(String mensagem) {
        errosSemanticos.add(mensagem);
    }

    @Override
    public void exitExpressaoAritInt(CmzmLangParser.ExpressaoAritIntContext ctx) {
        // Verificação semântica para expressões aritméticas com inteiros
        if (ctx.NInt() == null && ctx.Var() == null) {
            // Erro: a expressão não contém um número inteiro ou uma variável
            adicionarErroSemantico("Erro semântico: expressão aritmética sem número inteiro ou variável.");
        } else if (ctx.Var() != null) {
            String nomeVariavel = ctx.getText();
            if (!variavelDeclarada(nomeVariavel)) {
                // Erro: a variável não foi declarada
                adicionarErroSemantico("Erro semântico: variável '" + nomeVariavel + "' não foi declarada.");
            }
        }
        // Outras verificações semânticas, se necessário
        System.out.println("Saiu da regra ExpressaoAritInt");
    }

    @Override
    public void enterAtribuicaoInt(CmzmLangParser.AtribuicaoIntContext ctx) {
        // Verificação semântica para expressões aritméticas com inteiros
        if (ctx.Var() != null) {
            String nomeVariavel = ctx.Var().toString();
            if (!variavelDeclarada(nomeVariavel)) {
                // Erro: a variável não foi declarada
                adicionarErroSemantico("Erro semântico: variável '" + nomeVariavel + "' não foi declarada.");
            }
        }
        // Outras verificações semânticas, se necessário
        System.out.println("Saiu da regra ExpressaoAritInt");
    }

    private boolean variavelDeclarada(String nomeVariavel) {
        return variaveisDeclaradas.contains(nomeVariavel);
    }
    
    /*  @Override
    public void enterAtribuicao(CmzmLangParser.AtribuicaoContext ctx) {
       System.out.println("Entrou na regra Atribuição");
    }*/

    @Override
    public void enterProcedimento(CmzmLangParser.ProcedimentoContext ctx) {
        System.out.println("Entrou na regra Procedimento");
    }

    // Implemente outros métodos enter para as regras específicas conforme necessário

    @Override
    public void exitProcedimento(CmzmLangParser.ProcedimentoContext ctx) {
        System.out.println("Saiu da regra Procedimento");
    }

        @Override
    public void enterFuncao(CmzmLangParser.FuncaoContext ctx) {
        System.out.println("Entrou na regra Funcao ");
    }

    @Override
    public void exitFuncao(CmzmLangParser.FuncaoContext ctx) {
        System.out.println("Saiu da regra Funcao");
    }

        @Override
    public void enterComando(CmzmLangParser.ComandoContext ctx) {
        System.out.println("Entrou na regra Comando");
    }

    @Override
    public void exitComando(CmzmLangParser.ComandoContext ctx) {
        System.out.println("Saiu da regra Comando");
    }


    @Override
    public void enterExpressao(CmzmLangParser.ExpressaoContext ctx) {
        System.out.println("Entrou na regra Expressao");
    }

    @Override
    public void exitExpressao(CmzmLangParser.ExpressaoContext ctx) {
        System.out.println("Saiu da regra Expressao");
    }


    /*@Override
    public void enterDeclaracao(CmzmLangParser.DeclaracaoContext ctx) {
        System.out.println("Entrou na regra Declaracao");
    }

    @Override
    public void exitDeclaracao(CmzmLangParser.DeclaracaoContext ctx) {
        System.out.println("Saiu da regra Declaracao");
    }*/

    @Override
    public void enterCondicional(CmzmLangParser.CondicionalContext ctx) {
        System.out.println("Entrou na regra Condicional");
    }

    @Override
    public void exitCondicional(CmzmLangParser.CondicionalContext ctx) {
        System.out.println("Saiu da regra Condicional");
    }
    

     @Override
    public void enterRepeticao(CmzmLangParser.RepeticaoContext ctx) {
        System.out.println("Entrou na regra Repeticao");
    }

    @Override
    public void exitRepeticao(CmzmLangParser.RepeticaoContext ctx) {
        System.out.println("Saiu da regra Repeticao");
    }
    

     @Override
    public void enterExpressaoLogica(CmzmLangParser.ExpressaoLogicaContext ctx) {
        System.out.println("Entrou na regra ExpressaoLogica");
    }

    @Override
    public void exitExpressaoLogica(CmzmLangParser.ExpressaoLogicaContext ctx) {
        System.out.println("Saiu da regra ExpressaoLogica");
    }


     @Override
    public void enterExpressaoLogicaString(CmzmLangParser.ExpressaoLogicaStringContext ctx) {
        System.out.println("Entrou na regra ExpressaoLogicaString");
    }

    @Override
    public void exitExpressaoLogicaString(CmzmLangParser.ExpressaoLogicaStringContext ctx) {
        System.out.println("Saiu da regra ExpressaoLogicaString");
    }

    @Override
    public void enterExpressaoLogicaInt(CmzmLangParser.ExpressaoLogicaIntContext ctx) {
        System.out.println("Entrou na regra ExpressaoLogicaInt");
    }

    @Override
    public void exitExpressaoLogicaInt(CmzmLangParser.ExpressaoLogicaIntContext ctx) {
        System.out.println("Saiu da regra ExpressaoLogicaInt");
    }

     @Override
    public void enterExpressaoLogicaReal(CmzmLangParser.ExpressaoLogicaRealContext ctx) {
        System.out.println("Entrou na regra ExpressaoLogicaReal");
    }

    @Override
    public void exitExpressaoLogicaReal(CmzmLangParser.ExpressaoLogicaRealContext ctx) {
        System.out.println("Saiu da regra ExpressaoLogicaReal");
    }

    @Override
    public void exitAtribuicao(CmzmLangParser.AtribuicaoContext ctx) {
        System.out.println("Saiu da regra Atribuicao");
    }

    @Override
    public void enterAtribuicaoString(CmzmLangParser.AtribuicaoStringContext ctx) {
        System.out.println("Entrou na regra AtribuicaoString");
    }

    @Override
    public void exitAtribuicaoString(CmzmLangParser.AtribuicaoStringContext ctx) {
        System.out.println("Saiu da regra AtribuicaoString");
    }

    /*@Override
    public void enterAtribuicaoInt(CmzmLangParser.AtribuicaoIntContext ctx) {
        System.out.println("Entrou na regra AtribuicaoInt");
    }*/

    @Override
    public void exitAtribuicaoInt(CmzmLangParser.AtribuicaoIntContext ctx) {
        System.out.println("Saiu da regra AtribuicaoInt");
    }

    @Override
    public void enterAtribuicaoReal(CmzmLangParser.AtribuicaoRealContext ctx) {
        System.out.println("Entrou na regra AtribuicaoReal");
    }

    @Override
    public void exitAtribuicaoReal(CmzmLangParser.AtribuicaoRealContext ctx) {
        System.out.println("Saiu da regra AtribuicaoReal");
    }


    @Override
    public void enterMostraissu(CmzmLangParser.MostraissuContext ctx) {
        System.out.println("Entrou na regra Mostraissu");
    }

    @Override
    public void exitMostraissu(CmzmLangParser.MostraissuContext ctx) {
        System.out.println("Saiu da regra Mostraissu");
    }

    @Override
    public void enterExpressaoAritInt(CmzmLangParser.ExpressaoAritIntContext ctx) {
        System.out.println("Entrou na regra ExpressaoAritInt");
    }

    /*@Override
    public void exitExpressaoAritInt(CmzmLangParser.ExpressaoAritIntContext ctx) {
        System.out.println("Saiu da regra ExpressaoAritInt");
    }*/

    @Override
    public void enterExpressaoAritReal(CmzmLangParser.ExpressaoAritRealContext ctx) {
        System.out.println("Entrou na regra ExpressaoAritReal");
    }

    @Override
    public void exitExpressaoAritReal(CmzmLangParser.ExpressaoAritRealContext ctx) {
        System.out.println("Saiu da regra ExpressaoAritReal");
    }

    @Override
    public void enterExpressaoAritString(CmzmLangParser.ExpressaoAritStringContext ctx) {
        System.out.println("Entrou na regra ExpressaoAritString");
    }

    @Override
    public void exitExpressaoAritString(CmzmLangParser.ExpressaoAritStringContext ctx) {
        System.out.println("Saiu da regra ExpressaoAritString");
    }




}