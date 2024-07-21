public class reverseArray {

    static void reverse(int[] arr){
        int temp=arr[0];
        // for(int i=0;i<=arr.length-1;++i){
        //     for(int j=0;j<=arr.length-1;++j){
        //         if(arr[i]>arr[j]){
        //             temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<=arr.length-1;++i){
        //     System.out.println(arr[i]);
        // }

        int i=0, j=arr.length-1;

        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<=arr.length-1;++i){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
    int arr[]={56,23,45,1,8,0};

    reverse(arr);

       
    }
}