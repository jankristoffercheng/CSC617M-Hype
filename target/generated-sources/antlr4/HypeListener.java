// Generated from Hype.g4 by ANTLR 4.4

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HypeParser}.
 */
public interface HypeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HypeParser#int_atom}.
	 * @param ctx the parse tree
	 */
	void enterInt_atom(@NotNull HypeParser.Int_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#int_atom}.
	 * @param ctx the parse tree
	 */
	void exitInt_atom(@NotNull HypeParser.Int_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(@NotNull HypeParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(@NotNull HypeParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull HypeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull HypeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(@NotNull HypeParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(@NotNull HypeParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(@NotNull HypeParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(@NotNull HypeParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#head_items}.
	 * @param ctx the parse tree
	 */
	void enterHead_items(@NotNull HypeParser.Head_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#head_items}.
	 * @param ctx the parse tree
	 */
	void exitHead_items(@NotNull HypeParser.Head_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void enterInt_assignment(@NotNull HypeParser.Int_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#int_assignment}.
	 * @param ctx the parse tree
	 */
	void exitInt_assignment(@NotNull HypeParser.Int_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#parameters_again}.
	 * @param ctx the parse tree
	 */
	void enterParameters_again(@NotNull HypeParser.Parameters_againContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#parameters_again}.
	 * @param ctx the parse tree
	 */
	void exitParameters_again(@NotNull HypeParser.Parameters_againContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#par_expression}.
	 * @param ctx the parse tree
	 */
	void enterPar_expression(@NotNull HypeParser.Par_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#par_expression}.
	 * @param ctx the parse tree
	 */
	void exitPar_expression(@NotNull HypeParser.Par_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull HypeParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull HypeParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(@NotNull HypeParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(@NotNull HypeParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(@NotNull HypeParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(@NotNull HypeParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull HypeParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull HypeParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#p_content}.
	 * @param ctx the parse tree
	 */
	void enterP_content(@NotNull HypeParser.P_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#p_content}.
	 * @param ctx the parse tree
	 */
	void exitP_content(@NotNull HypeParser.P_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#int_mul_div_expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_mul_div_expr(@NotNull HypeParser.Int_mul_div_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#int_mul_div_expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_mul_div_expr(@NotNull HypeParser.Int_mul_div_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#head_item}.
	 * @param ctx the parse tree
	 */
	void enterHead_item(@NotNull HypeParser.Head_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#head_item}.
	 * @param ctx the parse tree
	 */
	void exitHead_item(@NotNull HypeParser.Head_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull HypeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull HypeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull HypeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull HypeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull HypeParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull HypeParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#webpage_body}.
	 * @param ctx the parse tree
	 */
	void enterWebpage_body(@NotNull HypeParser.Webpage_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#webpage_body}.
	 * @param ctx the parse tree
	 */
	void exitWebpage_body(@NotNull HypeParser.Webpage_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#id_and_classes}.
	 * @param ctx the parse tree
	 */
	void enterId_and_classes(@NotNull HypeParser.Id_and_classesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#id_and_classes}.
	 * @param ctx the parse tree
	 */
	void exitId_and_classes(@NotNull HypeParser.Id_and_classesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#brackets}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(@NotNull HypeParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#brackets}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(@NotNull HypeParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(@NotNull HypeParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(@NotNull HypeParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull HypeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull HypeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#int_evaluator}.
	 * @param ctx the parse tree
	 */
	void enterInt_evaluator(@NotNull HypeParser.Int_evaluatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#int_evaluator}.
	 * @param ctx the parse tree
	 */
	void exitInt_evaluator(@NotNull HypeParser.Int_evaluatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HypeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(@NotNull HypeParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HypeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(@NotNull HypeParser.ParametersContext ctx);
}