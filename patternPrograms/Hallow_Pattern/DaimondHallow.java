package patternPrograms.Hallow_Pattern;

public class DaimondHallow {
    public static void main(String[] args) {
        int n=10, noc=n, nor=n;
        for(int i=1;i<=(n*2)-1;i++){
            for(int j=1;j<=(n*2)-1;j++){
            if(j==noc || j==nor){
                    System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            }
            System.out.println();
            if(i<n){
                noc--;
                nor++;
            }
            else{
                noc++;
                nor--;
            }
        }
    }
}


/*


                  *
                *   *
              *       *
            *           *
          *               *
        *                   *
      *                       *       
    *                           *     
  *                               *   
*                                   * 
  *                               *   
    *                           *     
      *                       *       
        *                   *
          *               *
            *           *
              *       *
                *   *
                  *



 */