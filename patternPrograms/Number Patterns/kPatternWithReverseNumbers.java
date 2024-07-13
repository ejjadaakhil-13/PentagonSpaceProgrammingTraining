public class kPatternWithReverseNumbers {
    public static void main(String[] args) {
        int n=4, noc=1;
        for(int i=1;i<=((n*2)-1);++i){
            for(int j=n;j>=noc;--j){
                System.out.print(j+" ");
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



4 3 2 1
4 3 2
4 3
4
4 3
4 3 2
4 3 2 1




 */