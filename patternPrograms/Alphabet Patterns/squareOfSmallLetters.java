public class squareOfSmallLetters {
    
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(96 + j)+" ");
            }
            System.out.println();
        }
    }
}



/*


a b c d
a b c d
a b c d
a b c d



 */