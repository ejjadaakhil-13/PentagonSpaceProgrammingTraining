package reverseofNumbers;
import java.util.Scanner;

public class basic {

    // ------- method-1 ------ //

    // static void display(int store){
    //     if(store==0){
    //         return;
    //     }
    //     System.out.println(store);
    //     display(store-1);
    // }

    // ------- method-2 ------ //
    static void display(int n,int i){
        if(n==0){
            return;
        }
        System.out.println(n);
        display(n-1,i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int store=sc.nextInt();
        //display(store);
        int temp=store;
        display(temp,store);
        sc.close();
    }
}