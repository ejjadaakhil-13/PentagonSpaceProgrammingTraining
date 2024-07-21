public class BinarySearch {

    public static int binarySearch(int[] a1, int tar){
        int start=0, end=a1.length, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(tar == a1[mid]){
                return mid;
            }
            if(tar<a1[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    return -1;
    }
    
    public static void main(String[] args) {
        int tar=5;
        int[] a1={1,3,5,6};
        int res=binarySearch(a1,tar);

        if(res==-1){
            System.out.println("not present");
        }
        else{
            System.err.println("present");
        }

        
    }
}
