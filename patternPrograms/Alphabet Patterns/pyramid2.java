public class pyramid2 {
    public static void main(String[] args) {
        int n=5, count=1;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print((char)(96+count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}


/*


a
b c
d e f
g h i j
k l m n o



 */