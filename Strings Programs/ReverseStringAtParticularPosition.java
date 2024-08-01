public class ReverseStringAtParticularPosition {
    public static void main(String[] args) {
        String str="Apple are red";
        StringBuilder nstr=new StringBuilder();
        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++){

            char[] temp=arr[i].toCharArray();

            for(int j=temp.length-1;j>=0;--j){
                nstr.append(temp[j]);
            }

            nstr.append(" ");
        }
        System.out.println(nstr.toString());
    }
}
