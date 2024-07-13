public class KpatternWithNumbers {
    public static void main(String[] args) {
        int n=4, noc=n;
        for(int i=1;i<=((n*2)-1);++i){
            for(int j=1;j<=noc;++j){
                System.out.print(j+" ");
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


1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4


 */