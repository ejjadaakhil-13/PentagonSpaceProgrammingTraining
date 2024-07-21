public class secondMinimumAndMinimum {
    public static void main(String[] args) {
        int arr[]={56,23,45,1,8,0};
        int min=Integer.MAX_VALUE;
        int scemin=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-1;++i){
            if(min > arr[i]){
                scemin=min;
                min=arr[i];
        }
        else if((scemin > arr[i]) && (min!=arr[i]) ){
            scemin=arr[i];
        }
    }
        System.out.println(min+" , "+scemin);
    }
}
