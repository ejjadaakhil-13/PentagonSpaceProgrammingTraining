package sumofNNumbers;

import java.util.Scanner;

class sumOfNnaturalNumbers{

    static int sum(int num){
        if(num==1){
            return num;
        }
        return num+sum(num-1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the N natural numbers: ");
        int num=sc.nextInt();

        int res=sum(num);

        System.out.println(res);

        sc.close();
    }

}