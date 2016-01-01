/**
 * Created by BxJiang on 2015/11/30.
 */

import antlr.CMM_BXJLexer;
import antlr.CMM_BXJParser;
import app.MyListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        System.out.println("Enter your program ended with a line contains only $:");
        Scanner scanner = new Scanner(System.in);
        String prog="";

        while(scanner.hasNext()){
            try {
                String s = scanner.nextLine();
                if(s.equals("$"))break;
                prog+=s+"\n";
            }
            catch(Exception e){
                System.out.println("problem occured");
            }
        }

        try {
            CMM_BXJLexer lexer = new CMM_BXJLexer(new ANTLRInputStream(prog));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CMM_BXJParser parser = new CMM_BXJParser(tokens);
            CMM_BXJParser.InputContext input = parser.input();

            // create a standard ANTLR parse tree walker
            ParseTreeWalker walker = new ParseTreeWalker();
            // create listener then feed to walker
            MyListener loader = new MyListener();
            walker.walk(loader, input); // walk parse tree
        }catch (Exception e){
            if(e.getMessage() != null){
                System.out.println("Valid ERROR:" + e.getMessage());
            }else {
                e.printStackTrace();
            }
        }
    }

}
