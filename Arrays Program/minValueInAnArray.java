public class minValueInAnArray {
    // public static void main(String[] args) {
    //     int arr[]={8,-9,7,6,55,43,55};
    //     int min=Integer.MIN_VALUE;
    //     for(int i=0;i<=arr.length-1;++i){
    //         for(int j=0;j<=arr.length-1;++j){
    //             if(arr[i]<arr[j]){
    //                 min=arr[j];
    //                 arr[j]=arr[i];
    //                 arr[i]=min;
    //             }
    //         }
    //     }
    //     System.out.println(min);
    // }
    public static void main(String[] args) {
        int arr[]={8,-9,7,6,55,43,55};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;++i){
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            System.out.println(min);
        }
}
       


