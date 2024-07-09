package patternPrograms;

public class kPattern {
    public static void main(String[] args) {
        int n=4, noc=n;
        for(int i=1;i<=((n*2)-1);++i){  // describe the rows
            for(int j=1;j<=noc;++j){  // describe the columns
                System.out.print("*");
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


****
***
**
*
**
***
****


*/