package onetoFive;
import java.util.Scanner;

class oneToFive{

    static void view(int n){
        int temp=1;
        if (temp>n){
            return;
        }
        System.out.print("The numbers are: "+temp);
        ++temp;
        view(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int store=sc.nextInt();
        view(store);
        sc.close();
        
    }
}