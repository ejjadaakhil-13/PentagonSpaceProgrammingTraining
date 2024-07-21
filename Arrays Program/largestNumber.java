public class largestNumber {
    // public static void main(String[] args) {
    //     int arr[]={8,-9,7,6,55,43,55};
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<=arr.length-1;++i){
    //         for(int j=0;j<=arr.length-1;++j){
    //             if(arr[i]<arr[j]){
    //                 max=arr[j];
    //                 arr[j]=arr[i];
    //                 arr[i]=max;
    //             }
    //         }
    //     }
    //     System.out.println(max);
    // }
    public static void main(String[] args) {
        int arr[]={8,-9,7,6,55,43,55};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;++i){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
