package factorial;

import java.util.Scanner;

class factorial{

    static int sum(int num){
        if(num==1){
            return num;
        }
        else if(num==0){
            return 1;
        }
        else if(num<0){
            System.out.println("sorry bro it won't work");
            return 0;
        }
            return num*sum(num-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num=sc.nextInt();
        int res=sum(num);
        System.out.println(res);
        sc.close();
    }

}