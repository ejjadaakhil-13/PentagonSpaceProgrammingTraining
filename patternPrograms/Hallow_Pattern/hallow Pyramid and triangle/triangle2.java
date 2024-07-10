public class triangle2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;++i){  // describe the rows
            for(int j=5;j>=i;--j){  // describe the columns
                if(i==1 || i==n || j==i || j==1 ||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


/*


* * * * *

*     *

*   *

* *

*




 */