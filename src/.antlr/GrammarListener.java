// Generated from e:/Projects/Compiladores/Cmaizomenos/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GrammarParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GrammarParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVar(GrammarParser.DeclaracaoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVar(GrammarParser.DeclaracaoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GrammarParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GrammarParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condicionalSenao}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalSenao(GrammarParser.CondicionalSenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condicionalSenao}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalSenao(GrammarParser.CondicionalSenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(GrammarParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(GrammarParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(GrammarParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(GrammarParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressaoLogicaString}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaString(GrammarParser.ExpressaoLogicaStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressaoLogicaString}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaString(GrammarParser.ExpressaoLogicaStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressaoLogicaInt}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaInt(GrammarParser.ExpressaoLogicaIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressaoLogicaInt}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaInt(GrammarParser.ExpressaoLogicaIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressaoLogicaReal}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaReal(GrammarParser.ExpressaoLogicaRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressaoLogicaReal}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaReal(GrammarParser.ExpressaoLogicaRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GrammarParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GrammarParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atribuicaoString}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoString(GrammarParser.AtribuicaoStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atribuicaoString}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoString(GrammarParser.AtribuicaoStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atribuicaoInt}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoInt(GrammarParser.AtribuicaoIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atribuicaoInt}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoInt(GrammarParser.AtribuicaoIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#atribuicaoReal}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoReal(GrammarParser.AtribuicaoRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#atribuicaoReal}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoReal(GrammarParser.AtribuicaoRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressaoAritInt}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritInt(GrammarParser.ExpressaoAritIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressaoAritInt}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritInt(GrammarParser.ExpressaoAritIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expressaoAritReal}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritReal(GrammarParser.ExpressaoAritRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expressaoAritReal}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritReal(GrammarParser.ExpressaoAritRealContext ctx);
}