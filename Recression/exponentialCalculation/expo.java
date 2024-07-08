package exponentialCalculation;

import java.util.Scanner;

public class expo {
    static int power(int base, int pow){
    if (pow==1){
        return base;
    }
    else if(pow==0){
        return 1;
    }
    else
        return base*power(base,pow-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num:");
        int base=sc.nextInt();
        System.out.println("enter the power: ");
        int pow=sc.nextInt();
        int res=power(base,pow);
        System.out.println(res);
        sc.close();
    }
}
