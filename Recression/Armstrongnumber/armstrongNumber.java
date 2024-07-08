package Armstrongnumber;

import java.util.Scanner;

public class armstrongNumber {

    static int armstrong(int num,int sum, int digit){
        while (digit>0){
        }
        if (num==0){
            return sum;
        }
        
        return armstrong(num/10, sum, digit);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int digit=0;
        while(temp>0){
            temp=temp%10;
            digit++;
        }
    int res= armstrong(num, 0, digit);
    if (res==num){
        System.out.println("It's a armstrong Number......");
    }
    else{
        System.out.println("It's not a armstrong Number....");
    }
        sc.close();
    }
    
}
