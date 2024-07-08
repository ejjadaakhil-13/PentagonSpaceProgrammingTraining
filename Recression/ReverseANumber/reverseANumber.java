package ReverseANumber;

import java.util.Scanner;

public class reverseANumber {
    static int reverse(int sum, int num){
        if (num==0){
            return sum;
        }
        sum=(sum*10)+num%10;
        return reverse(sum,num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int res=reverse(sum,num);
        System.out.println(res);
        sc.close();
    }
    reverseANumber obj;
}
