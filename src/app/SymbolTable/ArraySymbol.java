package app.SymbolTable;

/**
 * Created by BxJiang on 2015/12/29.
 */
public class ArraySymbol extends Symbol{
    int size;
    String[] values;
    public ArraySymbol(String name, Type type, int size){
        super(name,type);
        this.size = size;
        values=new String[size];
    }

    public void setElementValue(int index,String value){
        values[index]=value;
    }
    public String getElementValue(int index){
        return values[index];
    }

    public void setValues(String[] values){
        int sz=values.length;
        for(int i=0;i<sz;i++){
            setElementValue(i,values[i]);
        }
    }


    public String getValuesStr(){
        String result="";
        for(String s:values){
            result+=" ("+s+") ";
        }
        return '{'+result+'}';
    }

    public String toString(){
        return '<'+name+"(ARRAY_"+type+"):"+ getValuesStr()+'>';
    }
}
