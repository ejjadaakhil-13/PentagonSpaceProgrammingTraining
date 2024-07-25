public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={15,20,1,3,6,5};
        for(int i=0;i<arr.length;++i){
            int small=arr[i];
            for(int j=i+1;j<arr.length;++j){
                if(arr[j]<small){
                    small=arr[j];
                    arr[j]=arr[i];
                    arr[i]=small;
                }
            }
        }
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
    }
}
