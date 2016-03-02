import java.util.HashMap;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main 
{
    public static void main( String[] args) throws Exception 
    {

        ANTLRInputStream input = new ANTLRInputStream
        		(ReadAndWrite.readFile("sample.txt"));

        HypeLexer lexer = new HypeLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HypeParser parser = new HypeParser(tokens);
        ParseTree tree = parser.start(); // begin parsing at rule 'r'
        //System.out.println(parser.start());
        System.out.println(parser.htmlString);
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}