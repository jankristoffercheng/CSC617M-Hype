// Generated from Hype.g4 by ANTLR 4.4

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HypeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, ID=35, INT=36, NEWLINE=37, WS=38, STRING=39, 
		COLOR=40, WORD=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'img'", "'title'", "'head'", "';'", "'{'", "'='", 
		"'}'", "'if'", "'for'", "'base'", "'int'", "'html'", "'('", "'*'", "'.'", 
		"'center'", "'p'", "'body'", "'!doctype'", "'script'", "'to'", "'link'", 
		"'basefont'", "'#'", "'div'", "'else'", "'meta'", "'hr'", "')'", "'+'", 
		"'span'", "'br'", "'-'", "ID", "INT", "NEWLINE", "WS", "STRING", "COLOR", 
		"WORD"
	};
	public static final int
		RULE_start = 0, RULE_html = 1, RULE_doctype = 2, RULE_webpage_body = 3, 
		RULE_head = 4, RULE_body = 5, RULE_id_and_classes = 6, RULE_classes = 7, 
		RULE_parameters = 8, RULE_parameters_again = 9, RULE_parameter = 10, RULE_head_items = 11, 
		RULE_head_item = 12, RULE_brackets = 13, RULE_for_loop = 14, RULE_content = 15, 
		RULE_p_content = 16, RULE_tag = 17, RULE_if_statement = 18, RULE_par_expression = 19, 
		RULE_expression = 20, RULE_assignment = 21, RULE_int_assignment = 22, 
		RULE_int_evaluator = 23, RULE_int_mul_div_expr = 24, RULE_int_atom = 25;
	public static final String[] ruleNames = {
		"start", "html", "doctype", "webpage_body", "head", "body", "id_and_classes", 
		"classes", "parameters", "parameters_again", "parameter", "head_items", 
		"head_item", "brackets", "for_loop", "content", "p_content", "tag", "if_statement", 
		"par_expression", "expression", "assignment", "int_assignment", "int_evaluator", 
		"int_mul_div_expr", "int_atom"
	};

	@Override
	public String getGrammarFileName() { return "Hype.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	String htmlString = "";
	int tabCount = 0;
	String head = "";
	String classes = "";
	String parameters = "";
	String content = "";
	String pcontent = "";

	public HypeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); html();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContext extends ParserRuleContext {
		public Webpage_bodyContext webpage_body;
		public Webpage_bodyContext webpage_body() {
			return getRuleContext(Webpage_bodyContext.class,0);
		}
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitHtml(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); doctype();
			setState(55); match(T__21);
			setState(56); match(T__28);
			setState(57); ((HtmlContext)_localctx).webpage_body = webpage_body();
			setState(58); match(T__26);
			htmlString += "<html>\n" + ((HtmlContext)_localctx).webpage_body.text +  "</html>";
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoctypeContext extends ParserRuleContext {
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitDoctype(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doctype);
		try {
			setState(63);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(T__14);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Webpage_bodyContext extends ParserRuleContext {
		public String text;
		public HeadContext head;
		public BodyContext body;
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Webpage_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webpage_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterWebpage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitWebpage_body(this);
		}
	}

	public final Webpage_bodyContext webpage_body() throws RecognitionException {
		Webpage_bodyContext _localctx = new Webpage_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_webpage_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); ((Webpage_bodyContext)_localctx).head = head();
			setState(66); ((Webpage_bodyContext)_localctx).body = body();
			((Webpage_bodyContext)_localctx).text =  ((Webpage_bodyContext)_localctx).head.text + ((Webpage_bodyContext)_localctx).body.text;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadContext extends ParserRuleContext {
		public String text;
		public Head_itemsContext head_items;
		public Head_itemsContext head_items() {
			return getRuleContext(Head_itemsContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(T__30);
				setState(70); match(T__28);
				setState(71); ((HeadContext)_localctx).head_items = head_items();
				setState(72); match(T__26);
				((HeadContext)_localctx).text =  "<head>\n" + ((HeadContext)_localctx).head_items.text + "</head>\n";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				((HeadContext)_localctx).text =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public String text;
		public ParametersContext parameters;
		public ContentContext content;
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(T__15);
			setState(79); ((BodyContext)_localctx).parameters = parameters();
			setState(80); match(T__28);
			setState(81); ((BodyContext)_localctx).content = content();
			setState(82); match(T__26);
				((BodyContext)_localctx).text =  "<body";
											if(!((BodyContext)_localctx).parameters.text.equals("")) {
												_localctx.text += " " + ((BodyContext)_localctx).parameters.text;
											}
											_localctx.text += ">\n" + ((BodyContext)_localctx).content.text + "</body>\n";
											content = "";
										
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_and_classesContext extends ParserRuleContext {
		public String text;
		public Token ID;
		public ClassesContext classes;
		public TerminalNode ID() { return getToken(HypeParser.ID, 0); }
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public Id_and_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_and_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterId_and_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitId_and_classes(this);
		}
	}

	public final Id_and_classesContext id_and_classes() throws RecognitionException {
		Id_and_classesContext _localctx = new Id_and_classesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id_and_classes);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(T__9);
				setState(86); ((Id_and_classesContext)_localctx).ID = match(ID);
				setState(87); ((Id_and_classesContext)_localctx).classes = classes();
				((Id_and_classesContext)_localctx).text =  "id=\"" + (((Id_and_classesContext)_localctx).ID!=null?((Id_and_classesContext)_localctx).ID.getText():null) + "\" " + ((Id_and_classesContext)_localctx).classes.text;
				}
				break;
			case EOF:
			case T__32:
			case T__31:
			case T__28:
			case T__26:
			case T__24:
			case T__23:
			case T__22:
			case T__20:
			case T__18:
			case T__17:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__7:
			case T__6:
			case T__5:
			case T__2:
			case T__1:
			case ID:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); ((Id_and_classesContext)_localctx).classes = classes();
				((Id_and_classesContext)_localctx).text =  ((Id_and_classesContext)_localctx).classes.text; classes = "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassesContext extends ParserRuleContext {
		public String text;
		public Token ID;
		public TerminalNode ID() { return getToken(HypeParser.ID, 0); }
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitClasses(this);
		}
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classes);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(T__18);
				setState(96); ((ClassesContext)_localctx).ID = match(ID);
				setState(97); classes();
				classes = (((ClassesContext)_localctx).ID!=null?((ClassesContext)_localctx).ID.getText():null) + " " + classes;
																((ClassesContext)_localctx).text =  "class=\""+classes.trim()+"\"";
				}
				break;
			case EOF:
			case T__32:
			case T__31:
			case T__28:
			case T__26:
			case T__24:
			case T__23:
			case T__22:
			case T__20:
			case T__17:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__7:
			case T__6:
			case T__5:
			case T__2:
			case T__1:
			case ID:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				((ClassesContext)_localctx).text =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public String text;
		public Parameters_againContext parameters_again;
		public Parameters_againContext parameters_again() {
			return getRuleContext(Parameters_againContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(T__20);
				setState(104); ((ParametersContext)_localctx).parameters_again = parameters_again();
				setState(105); match(T__4);
				((ParametersContext)_localctx).text =  ((ParametersContext)_localctx).parameters_again.text; parameters = "";
				}
				break;
			case EOF:
			case T__32:
			case T__31:
			case T__28:
			case T__26:
			case T__24:
			case T__23:
			case T__22:
			case T__17:
			case T__16:
			case T__13:
			case T__11:
			case T__10:
			case T__8:
			case T__7:
			case T__6:
			case T__5:
			case T__2:
			case T__1:
			case ID:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				((ParametersContext)_localctx).text =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameters_againContext extends ParserRuleContext {
		public String text;
		public ParameterContext parameter;
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Parameters_againContext parameters_again() {
			return getRuleContext(Parameters_againContext.class,0);
		}
		public Parameters_againContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_again; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterParameters_again(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitParameters_again(this);
		}
	}

	public final Parameters_againContext parameters_again() throws RecognitionException {
		Parameters_againContext _localctx = new Parameters_againContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters_again);
		try {
			setState(116);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); ((Parameters_againContext)_localctx).parameter = parameter();
				setState(112); parameters_again();
				parameters = ((Parameters_againContext)_localctx).parameter.text + " "+ parameters; ((Parameters_againContext)_localctx).text =  parameters.trim();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				((Parameters_againContext)_localctx).text =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public String text;
		public Token ID;
		public Token STRING;
		public Token COLOR;
		public List<TerminalNode> ID() { return getTokens(HypeParser.ID); }
		public TerminalNode COLOR() { return getToken(HypeParser.COLOR, 0); }
		public TerminalNode ID(int i) {
			return getToken(HypeParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(HypeParser.STRING, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); ((ParameterContext)_localctx).ID = match(ID);
				setState(119); match(T__27);
				setState(120); ((ParameterContext)_localctx).STRING = match(STRING);
				((ParameterContext)_localctx).text =  (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null) + "=" + (((ParameterContext)_localctx).STRING!=null?((ParameterContext)_localctx).STRING.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); ((ParameterContext)_localctx).ID = match(ID);
				setState(123); match(T__27);
				setState(124); ((ParameterContext)_localctx).ID = match(ID);
				((ParameterContext)_localctx).text =  (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null) + "=" + (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); ((ParameterContext)_localctx).ID = match(ID);
				setState(127); match(T__27);
				setState(128); ((ParameterContext)_localctx).COLOR = match(COLOR);
				((ParameterContext)_localctx).text =  (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null) + "=" + (((ParameterContext)_localctx).COLOR!=null?((ParameterContext)_localctx).COLOR.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130); ((ParameterContext)_localctx).ID = match(ID);
				((ParameterContext)_localctx).text =  (((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132); ((ParameterContext)_localctx).STRING = match(STRING);
				((ParameterContext)_localctx).text =  (((ParameterContext)_localctx).STRING!=null?((ParameterContext)_localctx).STRING.getText():null);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Head_itemsContext extends ParserRuleContext {
		public String text;
		public Head_itemContext head_item;
		public Head_itemsContext head_items() {
			return getRuleContext(Head_itemsContext.class,0);
		}
		public Head_itemContext head_item() {
			return getRuleContext(Head_itemContext.class,0);
		}
		public Head_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterHead_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitHead_items(this);
		}
	}

	public final Head_itemsContext head_items() throws RecognitionException {
		Head_itemsContext _localctx = new Head_itemsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_head_items);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case T__31:
			case T__23:
			case T__13:
			case T__11:
			case T__10:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); ((Head_itemsContext)_localctx).head_item = head_item();
				setState(137); head_items();
				head = ((Head_itemsContext)_localctx).head_item.text + head; ((Head_itemsContext)_localctx).text =  head;
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Head_itemContext extends ParserRuleContext {
		public String text;
		public Id_and_classesContext id_and_classes;
		public ParametersContext parameters;
		public Token STRING;
		public ContentContext content;
		public Id_and_classesContext id_and_classes() {
			return getRuleContext(Id_and_classesContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BracketsContext brackets() {
			return getRuleContext(BracketsContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode STRING() { return getToken(HypeParser.STRING, 0); }
		public Head_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterHead_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitHead_item(this);
		}
	}

	public final Head_itemContext head_item() throws RecognitionException {
		Head_itemContext _localctx = new Head_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_head_item);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(T__31);
				setState(144); ((Head_itemContext)_localctx).id_and_classes = id_and_classes();
				setState(145); ((Head_itemContext)_localctx).parameters = parameters();
				setState(146); match(T__28);
				setState(147); ((Head_itemContext)_localctx).STRING = match(STRING);
				setState(148); match(T__26);
					((Head_itemContext)_localctx).text =  "<title";
													if(!((Head_itemContext)_localctx).id_and_classes.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).id_and_classes.text;
													}
													if(!((Head_itemContext)_localctx).parameters.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).parameters.text;
													}
													_localctx.text += ">" + (((Head_itemContext)_localctx).STRING!=null?((Head_itemContext)_localctx).STRING.getText():null).replace("\"", "") + "</title>\n";
												
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); match(T__6);
				setState(152); ((Head_itemContext)_localctx).id_and_classes = id_and_classes();
				setState(153); ((Head_itemContext)_localctx).parameters = parameters();
				setState(154); brackets();
					((Head_itemContext)_localctx).text =  "<meta";
													if(!((Head_itemContext)_localctx).id_and_classes.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).id_and_classes.text;
													}
													if(!((Head_itemContext)_localctx).parameters.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).parameters.text;
													}
													_localctx.text += ">" + "</meta>\n";
												
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); match(T__11);
				setState(158); ((Head_itemContext)_localctx).id_and_classes = id_and_classes();
				setState(159); ((Head_itemContext)_localctx).parameters = parameters();
				setState(160); brackets();
					((Head_itemContext)_localctx).text =  "<link";
													if(!((Head_itemContext)_localctx).id_and_classes.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).id_and_classes.text;
													}
													if(!((Head_itemContext)_localctx).parameters.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).parameters.text;
													}
													_localctx.text += ">" + "</link>\n";
												
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); match(T__23);
				setState(164); ((Head_itemContext)_localctx).id_and_classes = id_and_classes();
				setState(165); ((Head_itemContext)_localctx).parameters = parameters();
				setState(166); brackets();
					((Head_itemContext)_localctx).text =  "<base";
													if(!((Head_itemContext)_localctx).id_and_classes.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).id_and_classes.text;
													}
													if(!((Head_itemContext)_localctx).parameters.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).parameters.text;
													}
													_localctx.text += ">" + "</base>\n";
												
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(169); match(T__10);
				setState(170); ((Head_itemContext)_localctx).id_and_classes = id_and_classes();
				setState(171); ((Head_itemContext)_localctx).parameters = parameters();
				setState(172); brackets();
					((Head_itemContext)_localctx).text =  "<basefront";
													if(!((Head_itemContext)_localctx).id_and_classes.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).id_and_classes.text;
													}
													if(!((Head_itemContext)_localctx).parameters.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).parameters.text;
													}
													_localctx.text += ">" + "</basefront>\n";
												
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(175); match(T__13);
				setState(176); ((Head_itemContext)_localctx).id_and_classes = id_and_classes();
				setState(177); ((Head_itemContext)_localctx).parameters = parameters();
				setState(178); match(T__28);
				setState(179); ((Head_itemContext)_localctx).content = content();
				setState(180); match(T__26);
					((Head_itemContext)_localctx).text =  "<script";
													if(!((Head_itemContext)_localctx).id_and_classes.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).id_and_classes.text;
													}
													if(!((Head_itemContext)_localctx).parameters.text.equals("")) {
														_localctx.text += " " + ((Head_itemContext)_localctx).parameters.text;
													}
													_localctx.text += ">\n" + ((Head_itemContext)_localctx).content.text + "</script>\n";
													content = "";
												
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketsContext extends ParserRuleContext {
		public BracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitBrackets(this);
		}
	}

	public final BracketsContext brackets() throws RecognitionException {
		BracketsContext _localctx = new BracketsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_brackets);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(T__28);
				setState(186); match(T__26);
				}
				break;
			case T__31:
			case T__26:
			case T__23:
			case T__13:
			case T__11:
			case T__10:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public String text;
		public Token a;
		public Token b;
		public ContentContext content;
		public TerminalNode INT(int i) {
			return getToken(HypeParser.INT, i);
		}
		public TerminalNode ID() { return getToken(HypeParser.ID, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(HypeParser.INT); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(T__24);
			setState(191); match(T__20);
			setState(192); match(ID);
			setState(193); match(T__27);
			setState(194); ((For_loopContext)_localctx).a = match(INT);
			setState(195); match(T__12);
			setState(196); ((For_loopContext)_localctx).b = match(INT);
			setState(197); match(T__4);
			setState(198); match(T__28);
			setState(199); ((For_loopContext)_localctx).content = content();
			setState(200); match(T__26);
				((For_loopContext)_localctx).text =  "";
												for(int i=Integer.parseInt((((For_loopContext)_localctx).a!=null?((For_loopContext)_localctx).a.getText():null)); i<Integer.parseInt((((For_loopContext)_localctx).b!=null?((For_loopContext)_localctx).b.getText():null)); i++) {
													_localctx.text += ((For_loopContext)_localctx).content.text;
												}
											
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public String text;
		public TagContext tag;
		public Token WORD;
		public For_loopContext for_loop;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode WORD() { return getToken(HypeParser.WORD, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_content);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case T__32:
			case T__17:
			case T__16:
			case T__8:
			case T__5:
			case T__2:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); ((ContentContext)_localctx).tag = tag();
				setState(204); content();
				content = ((ContentContext)_localctx).tag.text + content; ((ContentContext)_localctx).text =  content;
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); ((ContentContext)_localctx).WORD = match(WORD);
				setState(208); content();
				content = (((ContentContext)_localctx).WORD!=null?((ContentContext)_localctx).WORD.getText():null) + content; ((ContentContext)_localctx).text =  content;
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(211); ((ContentContext)_localctx).for_loop = for_loop();
				setState(212); content();
				content = ((ContentContext)_localctx).for_loop.text + content; ((ContentContext)_localctx).text =  content;
				}
				break;
			case T__22:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(215); assignment();
				setState(216); content();
				((ContentContext)_localctx).text =  content;
				}
				break;
			case EOF:
			case T__26:
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				((ContentContext)_localctx).text =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class P_contentContext extends ParserRuleContext {
		public String text;
		public TagContext tag;
		public Token WORD;
		public TerminalNode WORD() { return getToken(HypeParser.WORD, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public P_contentContext p_content() {
			return getRuleContext(P_contentContext.class,0);
		}
		public P_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterP_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitP_content(this);
		}
	}

	public final P_contentContext p_content() throws RecognitionException {
		P_contentContext _localctx = new P_contentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_p_content);
		try {
			setState(231);
			switch (_input.LA(1)) {
			case T__32:
			case T__17:
			case T__16:
			case T__8:
			case T__5:
			case T__2:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); ((P_contentContext)_localctx).tag = tag();
				setState(223); p_content();
				pcontent = ((P_contentContext)_localctx).tag.text + pcontent; ((P_contentContext)_localctx).text =  pcontent;
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); ((P_contentContext)_localctx).WORD = match(WORD);
				setState(227); p_content();
				pcontent = (((P_contentContext)_localctx).WORD!=null?((P_contentContext)_localctx).WORD.getText():null) + pcontent; ((P_contentContext)_localctx).text =  pcontent;
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				((P_contentContext)_localctx).text =  "";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public String text;
		public Id_and_classesContext id_and_classes;
		public ParametersContext parameters;
		public P_contentContext p_content;
		public ContentContext content;
		public Id_and_classesContext id_and_classes() {
			return getRuleContext(Id_and_classesContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public P_contentContext p_content() {
			return getRuleContext(P_contentContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tag);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); match(T__32);
				setState(234); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(235); ((TagContext)_localctx).parameters = parameters();
					((TagContext)_localctx).text =  "<img";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">\n";
											
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(T__1);
				setState(239); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(240); ((TagContext)_localctx).parameters = parameters();
					((TagContext)_localctx).text =  "<br";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">\n";
											
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); match(T__5);
				setState(244); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(245); ((TagContext)_localctx).parameters = parameters();
					((TagContext)_localctx).text =  "<hr";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">\n";
											
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(248); match(T__16);
				setState(249); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(250); ((TagContext)_localctx).parameters = parameters();
				setState(251); match(T__28);
				setState(252); ((TagContext)_localctx).p_content = p_content();
				setState(253); match(T__26);
					((TagContext)_localctx).text =  "<p";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">\n" + ((TagContext)_localctx).p_content.text + "</p>\n";
												pcontent = "";
											
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(256); match(T__17);
				setState(257); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(258); ((TagContext)_localctx).parameters = parameters();
				setState(259); match(T__28);
				setState(260); ((TagContext)_localctx).content = content();
				setState(261); match(T__26);
					((TagContext)_localctx).text =  "<center";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">" + ((TagContext)_localctx).content.text + "</center>\n";
												content = "";
											
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(264); match(T__2);
				setState(265); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(266); ((TagContext)_localctx).parameters = parameters();
				setState(267); match(T__28);
				setState(268); ((TagContext)_localctx).content = content();
				setState(269); match(T__26);
					((TagContext)_localctx).text =  "<span";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">" + ((TagContext)_localctx).content.text + "</span>\n";
												content = "";
											
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(272); match(T__8);
				setState(273); ((TagContext)_localctx).id_and_classes = id_and_classes();
				setState(274); ((TagContext)_localctx).parameters = parameters();
				setState(275); match(T__28);
				setState(276); ((TagContext)_localctx).content = content();
				setState(277); match(T__26);
					((TagContext)_localctx).text =  "<div";
												if(!((TagContext)_localctx).id_and_classes.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).id_and_classes.text;
												}
												if(!((TagContext)_localctx).parameters.text.equals("")) {
													_localctx.text += " " + ((TagContext)_localctx).parameters.text;
												}
												_localctx.text += ">\n" + ((TagContext)_localctx).content.text + "</div>\n";
												content = "";
											
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Par_expressionContext par_expression() {
			return getRuleContext(Par_expressionContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(T__25);
			setState(283); par_expression();
			setState(284); content();
			setState(287);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(285); match(T__7);
				setState(286); content();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Par_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Par_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterPar_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitPar_expression(this);
		}
	}

	public final Par_expressionContext par_expression() throws RecognitionException {
		Par_expressionContext _localctx = new Par_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_par_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(T__20);
			setState(290); expression();
			setState(291); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Int_evaluatorContext int_evaluator() {
			return getRuleContext(Int_evaluatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); int_evaluator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); int_assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_assignmentContext extends ParserRuleContext {
		public Token ID;
		public Int_evaluatorContext e;
		public TerminalNode ID() { return getToken(HypeParser.ID, 0); }
		public Int_evaluatorContext int_evaluator() {
			return getRuleContext(Int_evaluatorContext.class,0);
		}
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitInt_assignment(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int_assignment);
		int _la;
		try {
			setState(311);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); match(T__22);
				setState(298); ((Int_assignmentContext)_localctx).ID = match(ID);
				setState(301);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(299); match(T__27);
					setState(300); ((Int_assignmentContext)_localctx).e = int_evaluator();
					}
				}

				setState(303); match(T__29);

									memory.put((((Int_assignmentContext)_localctx).ID!=null?((Int_assignmentContext)_localctx).ID.getText():null), new Variable("int", (((Int_assignmentContext)_localctx).e.value == 0) ? "0" : String.valueOf(((Int_assignmentContext)_localctx).e.value)));
									System.out.println(((Int_assignmentContext)_localctx).e.value);
								
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); ((Int_assignmentContext)_localctx).ID = match(ID);
				setState(306); match(T__27);
				setState(307); ((Int_assignmentContext)_localctx).e = int_evaluator();
				setState(308); match(T__29);

									Integer v = Integer.parseInt(((Variable)memory.get((((Int_assignmentContext)_localctx).ID!=null?((Int_assignmentContext)_localctx).ID.getText():null))).getValue());
				        			if ( v==null ) System.err.println("undefined variable "+(((Int_assignmentContext)_localctx).ID!=null?((Int_assignmentContext)_localctx).ID.getText():null));
				        			else
				        			memory.put((((Int_assignmentContext)_localctx).ID!=null?((Int_assignmentContext)_localctx).ID.getText():null), new Variable("int", (((Int_assignmentContext)_localctx).e.value == 0) ? "0" : String.valueOf(((Int_assignmentContext)_localctx).e.value)));
									System.out.println(((Int_assignmentContext)_localctx).e.value);
								
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_evaluatorContext extends ParserRuleContext {
		public int value;
		public Int_mul_div_exprContext e;
		public List<Int_mul_div_exprContext> int_mul_div_expr() {
			return getRuleContexts(Int_mul_div_exprContext.class);
		}
		public Int_mul_div_exprContext int_mul_div_expr(int i) {
			return getRuleContext(Int_mul_div_exprContext.class,i);
		}
		public Int_evaluatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_evaluator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterInt_evaluator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitInt_evaluator(this);
		}
	}

	public final Int_evaluatorContext int_evaluator() throws RecognitionException {
		Int_evaluatorContext _localctx = new Int_evaluatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_int_evaluator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); ((Int_evaluatorContext)_localctx).e = int_mul_div_expr();
			((Int_evaluatorContext)_localctx).value =  ((Int_evaluatorContext)_localctx).e.value;
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__0) {
				{
				setState(323);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(315); match(T__3);
					setState(316); ((Int_evaluatorContext)_localctx).e = int_mul_div_expr();
					_localctx.value += ((Int_evaluatorContext)_localctx).e.value;
					}
					break;
				case T__0:
					{
					setState(319); match(T__0);
					setState(320); ((Int_evaluatorContext)_localctx).e = int_mul_div_expr();
					_localctx.value -= ((Int_evaluatorContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_mul_div_exprContext extends ParserRuleContext {
		public int value;
		public Int_atomContext e;
		public Int_atomContext int_atom(int i) {
			return getRuleContext(Int_atomContext.class,i);
		}
		public List<Int_atomContext> int_atom() {
			return getRuleContexts(Int_atomContext.class);
		}
		public Int_mul_div_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_mul_div_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterInt_mul_div_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitInt_mul_div_expr(this);
		}
	}

	public final Int_mul_div_exprContext int_mul_div_expr() throws RecognitionException {
		Int_mul_div_exprContext _localctx = new Int_mul_div_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_int_mul_div_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); ((Int_mul_div_exprContext)_localctx).e = int_atom();
			((Int_mul_div_exprContext)_localctx).value =  ((Int_mul_div_exprContext)_localctx).e.value;
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33 || _la==T__19) {
				{
				setState(338);
				switch (_input.LA(1)) {
				case T__19:
					{
					setState(330); match(T__19);
					setState(331); ((Int_mul_div_exprContext)_localctx).e = int_atom();
					_localctx.value *= ((Int_mul_div_exprContext)_localctx).e.value;
					}
					break;
				case T__33:
					{
					setState(334); match(T__33);
					setState(335); ((Int_mul_div_exprContext)_localctx).e = int_atom();
					_localctx.value /= ((Int_mul_div_exprContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_atomContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public Token ID;
		public Int_evaluatorContext int_evaluator;
		public TerminalNode ID() { return getToken(HypeParser.ID, 0); }
		public TerminalNode INT() { return getToken(HypeParser.INT, 0); }
		public Int_evaluatorContext int_evaluator() {
			return getRuleContext(Int_evaluatorContext.class,0);
		}
		public Int_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).enterInt_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HypeListener ) ((HypeListener)listener).exitInt_atom(this);
		}
	}

	public final Int_atomContext int_atom() throws RecognitionException {
		Int_atomContext _localctx = new Int_atomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_int_atom);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(343); ((Int_atomContext)_localctx).INT = match(INT);
				((Int_atomContext)_localctx).value =  Integer.parseInt((((Int_atomContext)_localctx).INT!=null?((Int_atomContext)_localctx).INT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(345); ((Int_atomContext)_localctx).ID = match(ID);

				        Integer v = Integer.parseInt(((Variable)memory.get((((Int_atomContext)_localctx).ID!=null?((Int_atomContext)_localctx).ID.getText():null))).getValue());
				        if ( v!=null ) ((Int_atomContext)_localctx).value =  v.intValue();
				        else System.err.println("undefined variable "+(((Int_atomContext)_localctx).ID!=null?((Int_atomContext)_localctx).ID.getText():null));
				        
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(347); match(T__20);
				setState(348); ((Int_atomContext)_localctx).int_evaluator = int_evaluator();
				setState(349); match(T__4);
				((Int_atomContext)_localctx).value =  ((Int_atomContext)_localctx).int_evaluator.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0165\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4B"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\th\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\5\13w\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba\n\16"+
		"\3\17\3\17\3\17\5\17\u00bf\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u011b\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u0122\n\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0130\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013a\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0146\n\31\f\31\16\31\u0149\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0155\n\32\f\32"+
		"\16\32\u0158\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0163"+
		"\n\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\2\u0170\2\66\3\2\2\2\48\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2"+
		"\fP\3\2\2\2\16_\3\2\2\2\20g\3\2\2\2\22o\3\2\2\2\24v\3\2\2\2\26\u0088\3"+
		"\2\2\2\30\u008f\3\2\2\2\32\u00b9\3\2\2\2\34\u00be\3\2\2\2\36\u00c0\3\2"+
		"\2\2 \u00de\3\2\2\2\"\u00e9\3\2\2\2$\u011a\3\2\2\2&\u011c\3\2\2\2(\u0123"+
		"\3\2\2\2*\u0127\3\2\2\2,\u0129\3\2\2\2.\u0139\3\2\2\2\60\u013b\3\2\2\2"+
		"\62\u014a\3\2\2\2\64\u0162\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\289\5\6\4"+
		"\29:\7\17\2\2:;\7\b\2\2;<\5\b\5\2<=\7\n\2\2=>\b\3\1\2>\5\3\2\2\2?B\7\26"+
		"\2\2@B\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\7\3\2\2\2CD\5\n\6\2DE\5\f\7\2EF\b"+
		"\5\1\2F\t\3\2\2\2GH\7\6\2\2HI\7\b\2\2IJ\5\30\r\2JK\7\n\2\2KL\b\6\1\2L"+
		"O\3\2\2\2MO\b\6\1\2NG\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ\7\25\2\2QR\5\22"+
		"\n\2RS\7\b\2\2ST\5 \21\2TU\7\n\2\2UV\b\7\1\2V\r\3\2\2\2WX\7\33\2\2XY\7"+
		"%\2\2YZ\5\20\t\2Z[\b\b\1\2[`\3\2\2\2\\]\5\20\t\2]^\b\b\1\2^`\3\2\2\2_"+
		"W\3\2\2\2_\\\3\2\2\2`\17\3\2\2\2ab\7\22\2\2bc\7%\2\2cd\5\20\t\2de\b\t"+
		"\1\2eh\3\2\2\2fh\b\t\1\2ga\3\2\2\2gf\3\2\2\2h\21\3\2\2\2ij\7\20\2\2jk"+
		"\5\24\13\2kl\7 \2\2lm\b\n\1\2mp\3\2\2\2np\b\n\1\2oi\3\2\2\2on\3\2\2\2"+
		"p\23\3\2\2\2qr\5\26\f\2rs\5\24\13\2st\b\13\1\2tw\3\2\2\2uw\b\13\1\2vq"+
		"\3\2\2\2vu\3\2\2\2w\25\3\2\2\2xy\7%\2\2yz\7\t\2\2z{\7)\2\2{\u0089\b\f"+
		"\1\2|}\7%\2\2}~\7\t\2\2~\177\7%\2\2\177\u0089\b\f\1\2\u0080\u0081\7%\2"+
		"\2\u0081\u0082\7\t\2\2\u0082\u0083\7*\2\2\u0083\u0089\b\f\1\2\u0084\u0085"+
		"\7%\2\2\u0085\u0089\b\f\1\2\u0086\u0087\7)\2\2\u0087\u0089\b\f\1\2\u0088"+
		"x\3\2\2\2\u0088|\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b\5\32\16\2\u008b\u008c\5\30"+
		"\r\2\u008c\u008d\b\r\1\2\u008d\u0090\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008a\3\2\2\2\u008f\u008e\3\2\2\2\u0090\31\3\2\2\2\u0091\u0092\7\5\2"+
		"\2\u0092\u0093\5\16\b\2\u0093\u0094\5\22\n\2\u0094\u0095\7\b\2\2\u0095"+
		"\u0096\7)\2\2\u0096\u0097\7\n\2\2\u0097\u0098\b\16\1\2\u0098\u00ba\3\2"+
		"\2\2\u0099\u009a\7\36\2\2\u009a\u009b\5\16\b\2\u009b\u009c\5\22\n\2\u009c"+
		"\u009d\5\34\17\2\u009d\u009e\b\16\1\2\u009e\u00ba\3\2\2\2\u009f\u00a0"+
		"\7\31\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\5\34\17"+
		"\2\u00a3\u00a4\b\16\1\2\u00a4\u00ba\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6"+
		"\u00a7\5\16\b\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa"+
		"\b\16\1\2\u00aa\u00ba\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\5\16\b"+
		"\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\5\34\17\2\u00af\u00b0\b\16\1\2\u00b0"+
		"\u00ba\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4\5"+
		"\22\n\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\7\n\2\2\u00b7"+
		"\u00b8\b\16\1\2\u00b8\u00ba\3\2\2\2\u00b9\u0091\3\2\2\2\u00b9\u0099\3"+
		"\2\2\2\u00b9\u009f\3\2\2\2\u00b9\u00a5\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9"+
		"\u00b1\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bf\7\n\2"+
		"\2\u00bd\u00bf\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\35"+
		"\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\7%\2\2\u00c3"+
		"\u00c4\7\t\2\2\u00c4\u00c5\7&\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7\7&"+
		"\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\5 \21\2\u00ca"+
		"\u00cb\7\n\2\2\u00cb\u00cc\b\20\1\2\u00cc\37\3\2\2\2\u00cd\u00ce\5$\23"+
		"\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\b\21\1\2\u00d0\u00df\3\2\2\2\u00d1"+
		"\u00d2\7+\2\2\u00d2\u00d3\5 \21\2\u00d3\u00d4\b\21\1\2\u00d4\u00df\3\2"+
		"\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\b\21\1\2\u00d8"+
		"\u00df\3\2\2\2\u00d9\u00da\5,\27\2\u00da\u00db\5 \21\2\u00db\u00dc\b\21"+
		"\1\2\u00dc\u00df\3\2\2\2\u00dd\u00df\b\21\1\2\u00de\u00cd\3\2\2\2\u00de"+
		"\u00d1\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df!\3\2\2\2\u00e0\u00e1\5$\23\2\u00e1\u00e2\5\"\22\2\u00e2\u00e3"+
		"\b\22\1\2\u00e3\u00ea\3\2\2\2\u00e4\u00e5\7+\2\2\u00e5\u00e6\5\"\22\2"+
		"\u00e6\u00e7\b\22\1\2\u00e7\u00ea\3\2\2\2\u00e8\u00ea\b\22\1\2\u00e9\u00e0"+
		"\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea#\3\2\2\2\u00eb"+
		"\u00ec\7\4\2\2\u00ec\u00ed\5\16\b\2\u00ed\u00ee\5\22\n\2\u00ee\u00ef\b"+
		"\23\1\2\u00ef\u011b\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\5\16\b\2\u00f2"+
		"\u00f3\5\22\n\2\u00f3\u00f4\b\23\1\2\u00f4\u011b\3\2\2\2\u00f5\u00f6\7"+
		"\37\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8\5\22\n\2\u00f8\u00f9\b\23\1\2"+
		"\u00f9\u011b\3\2\2\2\u00fa\u00fb\7\24\2\2\u00fb\u00fc\5\16\b\2\u00fc\u00fd"+
		"\5\22\n\2\u00fd\u00fe\7\b\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\7\n\2\2"+
		"\u0100\u0101\b\23\1\2\u0101\u011b\3\2\2\2\u0102\u0103\7\23\2\2\u0103\u0104"+
		"\5\16\b\2\u0104\u0105\5\22\n\2\u0105\u0106\7\b\2\2\u0106\u0107\5 \21\2"+
		"\u0107\u0108\7\n\2\2\u0108\u0109\b\23\1\2\u0109\u011b\3\2\2\2\u010a\u010b"+
		"\7\"\2\2\u010b\u010c\5\16\b\2\u010c\u010d\5\22\n\2\u010d\u010e\7\b\2\2"+
		"\u010e\u010f\5 \21\2\u010f\u0110\7\n\2\2\u0110\u0111\b\23\1\2\u0111\u011b"+
		"\3\2\2\2\u0112\u0113\7\34\2\2\u0113\u0114\5\16\b\2\u0114\u0115\5\22\n"+
		"\2\u0115\u0116\7\b\2\2\u0116\u0117\5 \21\2\u0117\u0118\7\n\2\2\u0118\u0119"+
		"\b\23\1\2\u0119\u011b\3\2\2\2\u011a\u00eb\3\2\2\2\u011a\u00f0\3\2\2\2"+
		"\u011a\u00f5\3\2\2\2\u011a\u00fa\3\2\2\2\u011a\u0102\3\2\2\2\u011a\u010a"+
		"\3\2\2\2\u011a\u0112\3\2\2\2\u011b%\3\2\2\2\u011c\u011d\7\13\2\2\u011d"+
		"\u011e\5(\25\2\u011e\u0121\5 \21\2\u011f\u0120\7\35\2\2\u0120\u0122\5"+
		" \21\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\'\3\2\2\2\u0123\u0124"+
		"\7\20\2\2\u0124\u0125\5*\26\2\u0125\u0126\7 \2\2\u0126)\3\2\2\2\u0127"+
		"\u0128\5\60\31\2\u0128+\3\2\2\2\u0129\u012a\5.\30\2\u012a-\3\2\2\2\u012b"+
		"\u012c\7\16\2\2\u012c\u012f\7%\2\2\u012d\u012e\7\t\2\2\u012e\u0130\5\60"+
		"\31\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7\7\2\2\u0132\u013a\b\30\1\2\u0133\u0134\7%\2\2\u0134\u0135\7\t"+
		"\2\2\u0135\u0136\5\60\31\2\u0136\u0137\7\7\2\2\u0137\u0138\b\30\1\2\u0138"+
		"\u013a\3\2\2\2\u0139\u012b\3\2\2\2\u0139\u0133\3\2\2\2\u013a/\3\2\2\2"+
		"\u013b\u013c\5\62\32\2\u013c\u0147\b\31\1\2\u013d\u013e\7!\2\2\u013e\u013f"+
		"\5\62\32\2\u013f\u0140\b\31\1\2\u0140\u0146\3\2\2\2\u0141\u0142\7$\2\2"+
		"\u0142\u0143\5\62\32\2\u0143\u0144\b\31\1\2\u0144\u0146\3\2\2\2\u0145"+
		"\u013d\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\61\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b"+
		"\5\64\33\2\u014b\u0156\b\32\1\2\u014c\u014d\7\21\2\2\u014d\u014e\5\64"+
		"\33\2\u014e\u014f\b\32\1\2\u014f\u0155\3\2\2\2\u0150\u0151\7\3\2\2\u0151"+
		"\u0152\5\64\33\2\u0152\u0153\b\32\1\2\u0153\u0155\3\2\2\2\u0154\u014c"+
		"\3\2\2\2\u0154\u0150\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\63\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7&\2\2"+
		"\u015a\u0163\b\33\1\2\u015b\u015c\7%\2\2\u015c\u0163\b\33\1\2\u015d\u015e"+
		"\7\20\2\2\u015e\u015f\5\60\31\2\u015f\u0160\7 \2\2\u0160\u0161\b\33\1"+
		"\2\u0161\u0163\3\2\2\2\u0162\u0159\3\2\2\2\u0162\u015b\3\2\2\2\u0162\u015d"+
		"\3\2\2\2\u0163\65\3\2\2\2\27AN_gov\u0088\u008f\u00b9\u00be\u00de\u00e9"+
		"\u011a\u0121\u012f\u0139\u0145\u0147\u0154\u0156\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}