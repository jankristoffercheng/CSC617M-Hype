grammar Hype;

@header {
import java.util.*;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
String htmlString = "";
int tabCount = 0;
String head = "";
String classes = "";
String parameters = "";
String content = "";
String pcontent = "";
}

start : html
	;
	
html : doctype 'html' '{' webpage_body '}' {htmlString += "<html>\n" + $webpage_body.text +  "</html>";}
	;
	
doctype : '!doctype'
                |
    ;

webpage_body returns [String text]: head body {$text = $head.text + $body.text;}
	;

head returns [String text] : 'head'  '{' head_items '}' {$text = "<head>\n" + $head_items.text + "</head>\n";}
						|	{$text = "";}
	;

body returns [String text] : 'body' parameters '{' content '}'
							{	$text = "<body";
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">\n" + $content.text + "</body>\n";
								content = "";
							}
	;

id_and_classes returns [String text]: '#' ID classes {$text = "id=\"" + $ID.text + "\" " + $classes.text;} | classes {$text = $classes.text; classes = "";} 
	;

classes returns [String text] : '.' ID classes {classes = $ID.text + " " + classes;
												$text = "class=\""+classes.trim()+"\"";}
         					| 	{$text = "";}
	;

parameters returns [String text] : '(' parameters_again ')' {$text = $parameters_again.text; parameters = "";}
								| {$text = "";}
	;
	
parameters_again returns [String text] : parameter parameters_again 
										{parameters = $parameter.text + " "+ parameters; $text = parameters.trim();}
									|	{$text = "";}
	;

parameter returns [String text]: ID '=' STRING	{$text = $ID.text + "=" + $STRING.text;}
							|	ID '=' ID		{$text = $ID.text + "=" + $ID.text;}
							|	ID '=' COLOR	{$text = $ID.text + "=" + $COLOR.text;}
							|	ID				{$text = $ID.text;}
							|	STRING			{$text = $STRING.text;}
	;
	
head_items returns [String text] : head_item head_items {head = $head_item.text + head; $text = head;}
               |
    ;

head_item returns [String text] :
								'title' id_and_classes parameters '{' STRING '}'
					            {	$text = "<title";
									if(!$id_and_classes.text.equals("")) {
										$text += " " + $id_and_classes.text;
									}
									if(!$parameters.text.equals("")) {
										$text += " " + $parameters.text;
									}
									$text += ">" + $STRING.text.replace("\"", "") + "</title>\n";
								}
							 	| 'meta' id_and_classes parameters brackets
								{	$text = "<meta";
									if(!$id_and_classes.text.equals("")) {
										$text += " " + $id_and_classes.text;
									}
									if(!$parameters.text.equals("")) {
										$text += " " + $parameters.text;
									}
									$text += ">" + "</meta>\n";
								}
					            | 'link' id_and_classes parameters brackets
					            {	$text = "<link";
									if(!$id_and_classes.text.equals("")) {
										$text += " " + $id_and_classes.text;
									}
									if(!$parameters.text.equals("")) {
										$text += " " + $parameters.text;
									}
									$text += ">" + "</link>\n";
								}
					            | 'base' id_and_classes parameters brackets
					            {	$text = "<base";
									if(!$id_and_classes.text.equals("")) {
										$text += " " + $id_and_classes.text;
									}
									if(!$parameters.text.equals("")) {
										$text += " " + $parameters.text;
									}
									$text += ">" + "</base>\n";
								}
					            | 'basefont' id_and_classes parameters brackets
					            {	$text = "<basefront";
									if(!$id_and_classes.text.equals("")) {
										$text += " " + $id_and_classes.text;
									}
									if(!$parameters.text.equals("")) {
										$text += " " + $parameters.text;
									}
									$text += ">" + "</basefront>\n";
								}
					            | 'script' id_and_classes parameters'{' content '}'
					            {	$text = "<script";
									if(!$id_and_classes.text.equals("")) {
										$text += " " + $id_and_classes.text;
									}
									if(!$parameters.text.equals("")) {
										$text += " " + $parameters.text;
									}
									$text += ">\n" + $content.text + "</script>\n";
									content = "";
								}
            ;
            
brackets : '{''}' | ;

for_loop returns [String text] : 'for' '(' ID '=' a=INT 'to' b=INT ')' '{' content '}'
								{	$text = "";
									for(int i=Integer.parseInt($a.text); i<Integer.parseInt($b.text); i++) {
										$text += $content.text;
									}
								}
	;

content returns [String text] : tag content {content = $tag.text + content; $text = content;}
							|	WORD content {content = $WORD.text + content; $text = content;}
							|	for_loop content {content = $for_loop.text + content; $text = content;}
							|	assignment content {$text = content;}
							|	{$text = "";}
	;
	
p_content returns [String text] : tag p_content {pcontent = $tag.text + pcontent; $text = pcontent;}
								| WORD p_content {pcontent = $WORD.text + pcontent; $text = pcontent;}
								| {$text = "";}
	;

tag returns [String text] : 'img' id_and_classes parameters
							{	$text = "<img";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">\n";
							}
          				| 'br' id_and_classes parameters
          					{	$text = "<br";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">\n";
							}
          				| 'hr' id_and_classes parameters
          					{	$text = "<hr";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">\n";
							}             
            
          				| 'p' id_and_classes parameters'{' p_content '}' 
          					{	$text = "<p";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">\n" + $p_content.text + "</p>\n";
								pcontent = "";
							} 
						| 'center' id_and_classes parameters  '{' content '}'
							{	$text = "<center";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">" + $content.text + "</center>\n";
								content = "";
							}
         				| 'span' id_and_classes parameters  '{' content '}'
         					{	$text = "<span";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">" + $content.text + "</span>\n";
								content = "";
							}
          				| 'div' id_and_classes parameters '{' content '}'
          					{	$text = "<div";
								if(!$id_and_classes.text.equals("")) {
									$text += " " + $id_and_classes.text;
								}
								if(!$parameters.text.equals("")) {
									$text += " " + $parameters.text;
								}
								$text += ">\n" + $content.text + "</div>\n";
								content = "";
							}
    ;
    
if_statement : 'if' par_expression content ('else' content)?
	;

par_expression : '(' expression ')'     
	;
	
expression : int_evaluator
	;
	
assignment : int_assignment
	;
	
int_assignment : 'int' ID ('=' e=int_evaluator)?';' 
				{
					memory.put($ID.text, new Variable("int", ($e.value == 0) ? "0" : String.valueOf($e.value)));
					System.out.println($e.value);
				}
				|	ID '=' e=int_evaluator ';'
				{
					Integer v = Integer.parseInt(((Variable)memory.get($ID.text)).getValue());
        			if ( v==null ) System.err.println("undefined variable "+$ID.text);
        			else
        			memory.put($ID.text, new Variable("int", ($e.value == 0) ? "0" : String.valueOf($e.value)));
					System.out.println($e.value);
				} 
	;	

int_evaluator returns [int value]: e=int_mul_div_expr {$value = $e.value;}
        (   '+' e=int_mul_div_expr {$value += $e.value;}
        |   '-' e=int_mul_div_expr {$value -= $e.value;}
        )*
	;

int_mul_div_expr returns [int value] : e=int_atom {$value = $e.value;} 
								(	'*' e=int_atom {$value *= $e.value;}
								|	'/'	e=int_atom {$value /= $e.value;}
								)*
	;
	
int_atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = Integer.parseInt(((Variable)memory.get($ID.text)).getValue());
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' int_evaluator ')' {$value = $int_evaluator.value;}
    ;
    
ID  	:   ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
INT 	:   '0'..'9'+ ;
NEWLINE	:	'\r'? '\n' ;
WS  	:   (' '|'\t')+ {skip();} ;
STRING	:  	'"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"';

fragment
ESCAPE_SEQUENCE
    	:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	|   UNICODE_ESCAPE
    	|   OCTAL_ESCAPE
    	;
    	
fragment
OCTAL_ESCAPE
    	:   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    	|   '\\' ('0'..'7') ('0'..'7')
    	|   '\\' ('0'..'7')
    	;
    	
fragment
UNICODE_ESCAPE
    	:   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    	;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
COLOR	:	'#'HEX_DIGIT+;
WORD 	: 	ID
         | 	COLOR
         |
         ;
