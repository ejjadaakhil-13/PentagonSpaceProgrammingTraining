public class assignment1 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
for(int j=1;j<=4;j++){
    if(i>=j){
        System.out.print((char)(64+i)+" ");
    }
    else{
        System.out.print((char)(64+j)+" ");
    }
}
System.out.println();
        }
    }
}

/*


A B C D
B B C D
C C C D
D D D D


 */