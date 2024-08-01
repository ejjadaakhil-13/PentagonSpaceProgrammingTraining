public class Interview {
    static void interview(String s){
        String nstr="";
        for(int i=0;i<s.length()-1;++i){
            if((((int)s.charAt(i)))%2==0 && (((int)s.charAt(i+1)))%2==0){
                nstr+=s.charAt(i);
                nstr+="*";
            }else if((((int)s.charAt(i)))%2!=0 && (((int)s.charAt(i+1)))%2!=0){
                nstr+=s.charAt(i);
                nstr+="-";
            }
            else{
                nstr+=s.charAt(i);
            }
        }
        nstr+=s.charAt(s.length()-1);
        System.out.println(nstr);
    }
    public static void main(String[] args) {
        String s="122456679";
        interview(s);
    }
}
