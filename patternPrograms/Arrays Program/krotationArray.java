public class krotationArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        int temp;
        while(k>=1){
            temp=arr[arr.length-1];
            arr[arr.length-1]=arr[0];
            arr[0]=temp;
            k=k-1;
        }
        for(int i=0;i<=arr.length-1;++i){
            System.out.println(arr[i]);
        }
    }
}
