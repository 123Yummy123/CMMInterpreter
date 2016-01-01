package app.SymbolTable;

/**
 * Created by BxJiang on 2015/12/28.
 */
public class Symbol {
    public static enum Type{INVALID, INT, DOUBLE, CHAR, BOOL}
    String name;
    Type type;
    String value;
    Scope scope;

    public Symbol(String name,Type type){
        this.name = name;
        this.type = type;
    }

    public Symbol(String name, Type type,String value){
        this(name,type);
        setValue(value);
    }

    public void setValue(String value){
        this.value = value;
    }
    public Type getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public String getValue(){
        if(value!=null)
            return value;
        return null;
    }


    public String toString(){
        return '<'+name+'('+type+"):"+value+'>';
    }
}
