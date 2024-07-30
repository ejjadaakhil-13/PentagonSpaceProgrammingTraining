public class ReversalOfString {

    static void reversal(String str){
        char ch[]=str.toCharArray();
        String nstr="";
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            ++i;
            --j;
        }
        for(i=0;i<ch.length;i++){
            nstr+=ch[i];
        }
        System.out.println(nstr);
    }

    static void reversal2(String str){
        String nstr="";
        int i;
        for(i=str.length()-1;i>=0;i--){
            nstr=nstr+str.charAt(i);

        }
        System.out.println(nstr);
    }

    static void reversal3(String str){
        String nstr="";
        int i;
        for(i=0;i<str.length();++i){
            nstr=str.charAt(i)+nstr;
        }
        System.out.println(nstr);
    }

    public static void main(String[] args) {
        String str="Now IronMan As DR.DooM";
        char ch[]=str.toCharArray();
        int len=ch.length-1;
        String nstr="";
        //reversal(str);
        //reversal2(str);
        reversal3(str);
        for(int i=len;i>=0;i--){
            nstr+=ch[i];
        }
       // System.out.println(nstr);
    }
}
