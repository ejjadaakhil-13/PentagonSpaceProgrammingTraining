
public class sandglass {
    public static void main(String[] args) {
        int n=4, noc=n;
        for(int i=1;i<=((n*2)-1);++i){  
            for(int k=1;k<=(n-noc);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=noc;++j){
                System.out.print(" *");
            }
            System.out.println();
            if(i<n){
                noc--;
            }
            else{
                noc++;
            }
        }
    }
}


/*



 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *





 */