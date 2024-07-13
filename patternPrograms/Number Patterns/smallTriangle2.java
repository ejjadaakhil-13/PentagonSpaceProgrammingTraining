public class smallTriangle2 {
    public static void main(String[] args) {
        int n=4, noc=1;
        
        for(int i=1;i<=n;++i){
            for(int j=noc;j>i;++j){
                System.out.print(j+" ");
                noc=noc+i;
            }
           
            System.out.println();
        }
    }
}
