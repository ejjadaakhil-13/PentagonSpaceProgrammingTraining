package patternPrograms;


public class patternUpperAndLower {
    public static void main(String[] args) {
        int n=4,noc=1;
        for(int i=1;i<=((n*2)-1);++i){
            for(int j=1;j<=noc;++j){
                System.out.print("* ");
            }
            System.out.println(" ");
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
* *
* * *
* * * *
* * *
* *
*



*/