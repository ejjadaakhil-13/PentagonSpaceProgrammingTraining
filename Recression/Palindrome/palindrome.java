package Palindrome;

import java.util.Scanner;

public class palindrome {
    //  ------- method-1 ----------//

    // static int reverse(int sum, int num){
    //     if (num==0){
    //         return sum;
    //     }
    //     sum=(sum*10)+num%10;
    //     return reverse(sum,num/10);
    // }

    // --------- method-2 -------- //

    static boolean reverse(int sum, int num,int temp){
        if (num==0){
            return sum==temp;
        }
        sum=(sum*10)+num%10;
        return reverse(sum,num/10,temp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        boolean res=reverse(sum,num,num);
        if (res==true){
            System.out.println(num + " It's a plaindrome....");
        }
        else{
            System.out.println("Sorry bro it's not a palindrome...");
        }
        sc.close();
    }
}


