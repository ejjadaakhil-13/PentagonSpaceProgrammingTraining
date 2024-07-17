public class LargestAndSmallest {
    static void smallest(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;++i){
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            System.out.println("Minimum value: "+min);
    }

    static void largest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;++i){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Largest Value: "+ max);

    }
    public static void main(String[] args) {
        int arr[]={8,-9,7,6,55,43,55};
        largest(arr);
        smallest(arr);
    }
}
