public class pascalTriangle {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=0;i<=n;++i){
           num=1;
            for(int j=0; j<=i;j++){
                System.out.print(num+" ");
                num=(num*(i-j))/(j+1);
            }
            System.out.println();
        }
    }
}



/*




1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1



 */