package countthedigits;

import java.util.Scanner;

public class countthedigit {
    static int counting(int n, int count){
        if (n==0){
            return count;
        }
        return counting(n/10,count+1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        int res= counting(n,count);
        System.out.println(res);
        sc.close();
    }
}
