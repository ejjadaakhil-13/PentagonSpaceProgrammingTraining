

public class butterflyPattern {
    public static void main(String[] args) {
        int noc=1,n=6, nor=(n*2)-1,  i , j;
        for(i=1;i<=(n*2)-1;i++){
            for(j=1;j<=(n*2)-1;j++){
                if(j<=noc || j>=nor){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i<n){
                noc++;
                nor--;
            }
            else{
                nor++;
                noc--;
        }

        }
    }
}


/*



*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *




*/