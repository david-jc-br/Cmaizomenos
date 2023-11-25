// Generated from ./CmzmLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmzmLangParser}.
 */
public interface CmzmLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CmzmLangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CmzmLangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(CmzmLangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(CmzmLangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVar(CmzmLangParser.DeclaracaoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#declaracaoVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVar(CmzmLangParser.DeclaracaoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(CmzmLangParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(CmzmLangParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(CmzmLangParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(CmzmLangParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogica(CmzmLangParser.ExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressaoLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogica(CmzmLangParser.ExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressaoLogicaString}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaString(CmzmLangParser.ExpressaoLogicaStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressaoLogicaString}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaString(CmzmLangParser.ExpressaoLogicaStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressaoLogicaInt}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaInt(CmzmLangParser.ExpressaoLogicaIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressaoLogicaInt}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaInt(CmzmLangParser.ExpressaoLogicaIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressaoLogicaReal}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoLogicaReal(CmzmLangParser.ExpressaoLogicaRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressaoLogicaReal}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoLogicaReal(CmzmLangParser.ExpressaoLogicaRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(CmzmLangParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(CmzmLangParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#atribuicaoString}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoString(CmzmLangParser.AtribuicaoStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#atribuicaoString}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoString(CmzmLangParser.AtribuicaoStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#atribuicaoInt}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoInt(CmzmLangParser.AtribuicaoIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#atribuicaoInt}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoInt(CmzmLangParser.AtribuicaoIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#atribuicaoReal}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoReal(CmzmLangParser.AtribuicaoRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#atribuicaoReal}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoReal(CmzmLangParser.AtribuicaoRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressaoAritInt}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritInt(CmzmLangParser.ExpressaoAritIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressaoAritInt}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritInt(CmzmLangParser.ExpressaoAritIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmzmLangParser#expressaoAritReal}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritReal(CmzmLangParser.ExpressaoAritRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmzmLangParser#expressaoAritReal}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritReal(CmzmLangParser.ExpressaoAritRealContext ctx);
}