package exponentialCalculation;

import java.util.Scanner;

// public class expo {
//     static int power(int base, int pow){
//     if (pow==1){
//         return base;
//     }
//     else if(pow==0){
//         return 1;
//     }
//     else
//         return base*power(base,pow-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the num:");
//         int base=sc.nextInt();
//         System.out.println("enter the power: ");
//         int pow=sc.nextInt();
//         int res=power(base,pow);
//         System.out.println(res);
//         sc.close();
//     }
// }

public class expo{
    static int counting(int n, int count){
        if (n==0){
            return count;
        }
        return counting(n/10,count+1);
    }
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


    static int armstrong(int num,int sum,int digit){

        if(num==0){
            return sum;
        }
        sum=sum+expon((num%10),digit);
        return armstrong(num/10,sum,digit);
    }

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number: ");
    int num=sc.nextInt();
    int count=0;
    int temp=num;
    int digit=counting(num, count);
    int sum=0;
    int res=armstrong(num,sum,digit);

    if(res==temp){
        System.out.println("Its a armstrong Number bro.....");
    }
    else{
    System.out.println("It's not a armstrong number bro try again :(");
}
    sc.close();
}
}