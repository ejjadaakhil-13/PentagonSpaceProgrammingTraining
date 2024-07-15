public class lastpatttern {
    public static void main(String[] args) {
        int count=0;
        for(int i=1; i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((char)(65+count) + " ");
                count++;
            }
            count=i;
            System.out.println();
        }
    }
}


/*


A B C D E
B C D E F
C D E F G
D E F G H
E F G H I


 */