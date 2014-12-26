package example.t;

import example.t.meta.ClassDetailListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class Parse {

    public static void main(String[] argus) throws Exception{
        String fileName = "/home/caoyanfei079/workspace/account.app/src/main/java/com/lufax/account/resources/AccountResource.java";
        parseFile(fileName);
//        System.out.println(result);
    }





    public static void parseFile(String f) throws Exception{

        Lexer lexer = new JavaLexer(new ANTLRFileStream(f));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        JavaParser parser = new JavaParser(tokens);
        parser.addParseListener(new ClassDetailListener());
        ParserRuleContext t = parser.compilationUnit();
//        String result = parseTree(t,0);
//        System.out.println(result);
//        System.out.println(t.toStringTree(parser));
    }
    public static String parseTree(ParseTree treeNode, int level) {
        String result = "";
        if(treeNode != null) {
            result += StringUtils.repeat("    ", level) + treeNode.getClass() + "->:" + treeNode.getText() + "\r\n";
            int count = treeNode.getChildCount();
            for(int i =0 ; i < count; i++) {
                result += parseTree(treeNode.getChild(i), level+1) + "\n\n";
            }
        }
        return result;
    }


}
