public class ascciivalue {
    public static void main(String[] args) {
        int n=5, count=1;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){

                if(count%2==0){
                    System.out.print((char)(96+count)+" ");
                    count++;
                }
                else{
                    System.out.print((char)(64+count)+" ");
                    count++;
                
                }
                
            }
            System.out.println();
        }
    }
}

/*


A
b C
d E f
G h I j
K l M n O


 */