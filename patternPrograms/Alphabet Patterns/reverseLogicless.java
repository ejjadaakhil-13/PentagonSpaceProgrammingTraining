public class reverseLogicless {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i<=1;--i){
            for(int j=n;j<=1;--j){
                if(i<=j){
                    System.out.print((char)(64+i)+" ");
                }
                else{
                    System.out.print((char)(64+j)+" ");
                }
            }
            System.out.println();
             

        }
    }
}
