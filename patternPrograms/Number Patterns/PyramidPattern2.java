public class PyramidPattern2 {
    public static void main(String[] args) {
        int n=5,count=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;--j){
                System.out.print(" ");
            }
                for(int k=1;k<=i;++k){
                        System.out.print(count+"  ");
                        count=count+1;
                    
                }
                System.out.println();
                }
            
        }
}


/*


    1  
   2  3
  4  5  6
 7  8  9  10  
11  12  13  14  15


 */