public class pyramid {
    public static void main(String[] args) {
        int n=4, count=1;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}



/*


A
B C
D E F
G H I J


 */