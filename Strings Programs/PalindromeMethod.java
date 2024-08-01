public class PalindromeMethod {

    static String purification(String str){
        String nstr="";
        
        for(int i=0;i<str.length();++i){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')){
                char ch=(char)(str.charAt(i)+32);
                nstr+=ch;
            }
            else if((str.charAt(i)>='a' && str.charAt(i)<='z')){
                nstr+=str.charAt(i);
            }
            else if ((str.charAt(i)>='0' && str.charAt(i)<='9')){
                nstr+=str.charAt(i);
            }
        }
        return nstr;
    }

    static boolean isPalindrome(String s){
        s=purification(s);
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Mr.owl, ate my Metal worm";
        //String nstr=purification(str);
        boolean res=isPalindrome(str);
        if(res==true){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
