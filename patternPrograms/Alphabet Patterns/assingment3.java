public class assingment3 {
    
    public static void main(String[] args) {
        int n=4;
        int count=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+count) +" ");
                count--;
        }
System.out.println();
    }
    }
}

/*




J
I H
G F E
D C B A



 */