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

    public static int binarySearchDesc(int[] a1, int tar){
        int start=0, end=a1.length, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(tar == a1[mid]){
                return mid;
            }
            if(tar<a1[mid]){
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }
        }
    return -1;
    }

    static int orderAgnosticBs(int a1[], int tar){
        int start=0, end=a1.length-1, mid;
        boolean flag=true;
        if(a1[start]>a1[end]){
            flag=false;
        }
        while(start<=end){
            mid=start+(end-start)/2;
            if(a1[mid]==tar){
                return mid;
            }
            if(flag==true){
                if(tar<a1[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
               
            }
            else{
                if(tar<a1[mid]){
                    start=mid+1;
                    
                }
                else{
                    end=mid-1;
                }
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int tar=5;
        int[] a1={1,3,5,6};
        //int res=binarySearch(a1,tar);
        int res=orderAgnosticBs(a1,tar);

        if(res==-1){
            System.out.println("not present");
        }
        else{
            System.err.println("present");
        }
    }
}
