package Armstrongnumber;

import java.util.Scanner;

public class armstrongNumber {

    // --- counting the number of digits for calculating the power ---//

    static int counting(int n, int count){
        if (n==0){
            return count;
        }
        return counting(n/10,count+1);
    }

    // ------------ calculating the power method ----------- //

    static int expon(int base, int pow){
            if (pow==1){
                return base;
            }
            else if(pow==0){
                return 1;
            }
            else
                return base*expon(base,pow-1);
            }

    //  ---------armstrong number method ----------

    static int armstrong(int num,int sum,int digit){

        if(num==0){
            return sum;
        }
        sum=sum+expon((num%10),digit);         //  --recursive call for the calculating power ....

        return armstrong(num/10,sum,digit);     // -- recursive call for checking whether it is armstrong or not ...
    }

    // ------------- main method ---------------
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number: ");
    int num=sc.nextInt();
    int count=0;
    int temp=num;
    int digit=counting(num, count);     //  calling method counting inorder to calculate the power..
    int sum=0;
    int res=armstrong(num,sum,digit);   //  calling the armstrong method inorder to check the number whether it is armstrong or not...

    if(res==temp){
        System.out.println("Its a armstrong Number bro.....:) ");
    }
    else{
    System.out.println("It's not a armstrong number bro try again :( ");
}
    sc.close();
}
}