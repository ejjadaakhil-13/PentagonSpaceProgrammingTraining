
public class reversePyramid {
    public static void main(String[] args) {
        int n=5, noc=1;
        for(int i=1; i<=(n*2)-1; i++){
            for(int k=1;k<=(n-noc);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=noc;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n){
                noc++;
            }
            else{
                noc--;
            }
        }
    }
}



/*

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *



 */