import java.util.Scanner;

public class LinearSearchDemo {

    static Scanner sc= new Scanner(System.in);

    static int[] creation(){
        int size;
        System.out.println("enter the size of array: ");
        size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;++i){
            System.out.println("Yoo guru enter the data in to array: ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }


    // Linear Search algorithm
    
    static void finidngelement(){
        int arr[]=creation();
        System.out.println("enter the element you want to find: ");
        int find=sc.nextInt();
        int target=-1;
        for(int i=0;i<arr.length;++i){
            if(find==arr[i]){
                target=i;
                break;
            }
        }
        if(target==-1){
            System.out.println("sorry guru the element is not present");
        }
        else{
            System.out.println("yes it present in the "+target+" position");
        }
    }

    public static void main(String[] args) {
        finidngelement();
    }
}
