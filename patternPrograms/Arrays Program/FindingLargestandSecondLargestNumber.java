public class FindingLargestandSecondLargestNumber {
    public static void main(String[] args) {
        int arr[]={56,23,45,1,8,0};
    //     int temp=arr[0];
    //     for(int i=0;i<=arr.length-1;++i){
    //         for(int j=0;j<=arr.length-1;++j){
    //             if(arr[i]<arr[j]){
    //                 temp=arr[j];
    //                 arr[j]=arr[i];
    //                 arr[i]=temp;
    //             }
    //         }
    //     }

    //     for(int i=0;i<=arr.length-1;++i){
    //         System.out.print(arr[i]+", ");
    // }

    int max=Integer.MIN_VALUE;
    int scemax=Integer.MAX_VALUE;
    for(int i=0;i<=arr.length-1;++i){
        if(max<arr[i]){
            scemax=max;
            max=arr[i];
        }
        else if((scemax<arr[i]) && (max!=arr[i]) ){
            scemax=arr[i];
        }
    }
    System.out.println(max+" "+scemax);
}
}