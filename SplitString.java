import java.util.ArrayList;

public class SplitString {

    String S;

    public SplitString(String s){
        S = s;
    }
    public String[] split(String regex){
        char ch;
        if(regex==null||regex.length()>2)
            return null;
        else if(regex.length()==2&&regex.charAt(0)=='\\')
            ch = regex.charAt(1);
        else
            ch = regex.charAt(0);

        String[] result=null;
        ArrayList<String> stringList = new ArrayList<String>();
        StringBuilder str= new StringBuilder("");

        for(int i=0;i<this.S.length();i++){
            if(this.S.charAt(i)==ch){
                stringList.add(str.toString());
                str = new StringBuilder("");
            }
            else
                str.append(this.S.charAt(i));
        }
        stringList.add(str.toString());
        result = new String[stringList.size()];
        return stringList.toArray(result);
    }

    public static void main(String args[]){
        SplitString obj = new SplitString("vidhu?shekhar");

        System.out.println(obj.split("?").length);
        for(String s:obj.split("?"))
            System.out.println(s);
       // System.out.println(",vidhu,shekhar".split(",").length);
    }

}