class MergeSortAlgo{

    public static void  mergeSort(int[] arr){
        int len=arr.length;
        if(len<=1){
            return ; //stop the recursion
        }

        int middle=len/2;
        int left_arr[]= new int[middle];
        int right_arr[]=new int[len-middle];
        int i,j=0;
        for(i=0;i<len;i++){
            if(i<middle){
                left_arr[i]=arr[i];
            }
            else{
                right_arr[j]=arr[i];
                ++j;
            }
        }
        mergeSort(left_arr);
        mergeSort(right_arr);
        merge(left_arr,right_arr,arr);

    }
    public static void merge(int[] left_arr,int[] right_arr,int[] arr){
        int i=0, l=0,r=0;
        int len=arr.length;
        int left_size=len/2;
        int right_size=len-left_size;
        //System.out.println("sorting happening");
        while(l<left_size && r<right_size){
            if(left_arr[l]<right_arr[r]){
                arr[i]=left_arr[l];
                ++i;
                ++l;
            }
            else{
                arr[i]=right_arr[r];
                ++i;
                ++r;
            }
        }
        while(l<left_size){
            arr[i]=left_arr[l];
            ++i;
            ++l;
    
        }
        while(r<right_size){
                arr[i]=right_arr[r];
                ++i;
                ++r;
        }
    }
    public static void main(String[] args) {
        int arr[]={8,10,6,75,65,30,0};
        System.out.println("unsorted array: ");
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nsorted array: ");
        mergeSort(arr);         // Calling the merge method....
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
    }

}