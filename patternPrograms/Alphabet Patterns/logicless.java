public class logicless {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
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

/*


A A A A A
A B B B B
A B C C C
A B C D D
A B C D E


 */