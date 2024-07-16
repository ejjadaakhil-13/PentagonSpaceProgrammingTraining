import java.util.Scanner;
public class CreationOfArray {

    //1. creation of an array

    static int[] creation(){
        int i, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("yoo bro enter the size: ");
        
        size = sc.nextInt();
        int[] arr = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("yoo bro enter you value: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int sizeOfarray(){
        int[] res=creation();
        int size=res.length;
        return size;
    }

    // 2. sum of elements in an array

    static int sumOfArray(){
        int[] res= creation();
        int sum=0;
        for (int i = 0; i < res.length; i++) {
         sum=sum+res[i];
        }
        System.out.println("the sum is: " + sum);
        return sum;
    }

    // 3. average of an array.

    static void average(){
        double res=sumOfArray();
        int dec=sizeOfarray();
        double avg= res/dec;
        System.out.println(avg);
    }


    public static void main(String[] args) {
        average();
    }
    
}
