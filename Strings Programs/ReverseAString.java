public class ReverseAString {
    public static void main(String[] args) {
        String str="Robert Downey Jr Died As A Hero And reancarnated as a villan ";
        String arr[]=str.split(" ");
        StringBuilder nstr=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            nstr.append(arr[i]+" ");
        }
        System.out.println(nstr);
    }
}
