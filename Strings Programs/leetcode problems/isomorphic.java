public class isomorphic {
    public static void main(String[] args) {
        String s="foo";
        String t="bar";
        int[] asciis=new int[200];
        int[] asciit=new int[200];
        boolean res=iso(s,t,asciis,asciit);
        System.out.println(res);
    }
     static boolean iso(String s, String t, int[] asciis, int[] asciit) {
        for(int i=0;i<s.length();++i){
            if (asciis[(int)s.charAt(i)]!=asciit[(int)t.charAt(i)])
                return false;
                asciis[(int)s.charAt(i)]=i+1;
                asciit[(int)t.charAt(i)]=i+1;
        }
        return true;
    }
}
