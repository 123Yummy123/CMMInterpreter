package app.SymbolTable;

import antlr.CMM_BXJParser;
import org.antlr.v4.runtime.Token;

/**
 * Created by BxJiang on 2015/12/28.
 */
public class CheckSymbols {
    public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case CMM_BXJParser.T_INT :  return Symbol.Type.INT;
            case CMM_BXJParser.T_DOUBLE :   return Symbol.Type.DOUBLE;
            case CMM_BXJParser.T_CHAR : return Symbol.Type.CHAR;
            case CMM_BXJParser.T_BOOL : return Symbol.Type.BOOL;
        }
        return Symbol.Type.INVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }
}
