public class newPattern {

    public static void main(String[] args) {
        int n=4, nor=n;
        for(int i=1;i<=((n*2)-1);++i){
            for(int j=nor;j>=1;--j){
                System.out.print(j+" ");
            }
            System.out.println();
            if(i<n){
                nor--;
            }
            else{
                nor++;
            }
        }
    }
    
}


/*



4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1



 */