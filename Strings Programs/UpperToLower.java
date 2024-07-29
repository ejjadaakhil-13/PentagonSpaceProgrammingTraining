public class UpperToLower {
    public static void main(String[] args) {
        String s="ROBERTDOWNEYJrASDooms1";
        String newString="";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z')
            ch[i]=(char)(((int)ch[i])+32);
        }

        // using another string class variable

        for(int i=0;i<ch.length;i++){
            newString+=ch[i];
        }
        System.out.println(newString);

        //using StringBuilder and toString

        StringBuilder nstr=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            nstr.append(ch[i]);
        }
        System.out.println(nstr.toString());

    }
}


