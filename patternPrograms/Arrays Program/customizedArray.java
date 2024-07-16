
import java.util.Scanner;

public class customizedArray {

    public static void main(String[] args) {
        int i, size;
        Scanner sc = new Scanner(System.in);
        System.out.println("yoo bro enter the size: ");
        
        size = sc.nextInt();
        int[] arr = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("yoo bro enter you value: ");
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
}
