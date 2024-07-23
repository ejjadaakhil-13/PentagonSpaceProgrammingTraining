package leetcode;

public class Leetcode1092 {

    static int findPeak(MountainArray mountainArr){
        int n=mountainArr.length();
        int start=1, end=n-2, mid, left, center, right;
        while(start<=end){
            mid=start+(end-start)/2;
            left=mountainArr.get(mid-1);
            center=mountainArr.get(mid);
            right=mountainArr.get(mid+1);
            if(left<center && center <right){
                start=mid+1;
            }else if(left>center && center>right){
                end= mid-1;
            }else if(left<center && center>right){
                return mid;
            }
        }
        return -1;
    }

    static int orderAgnosticBs(int target, MountainArray mountainArr, int start, int end){
        int mid, val;
        boolean flag=true;

        if(mountainArr.get(start)>mountainArr.get(end)){
            flag=true;
        }
        while(start<=end){
            mid=start+ (end-start)/2;
            val=mountainArr.get(mid);
            if(target==val){
                return mid;
            }
            if(flag==true){
                if(target<val){
                    end=mid-1;
                }else{
                    start=mid+1;
                }else{
                    if(target<val){
                        start=mid+1;
                    }else{
                        end=mid-1;
                    }
                }
            }
        }
        return -1;
    }
public int findInMountainArray(int target, MountainArr mountainArr)
    int index=orderAgnosticBs(int target, MountainArray, 0, peak);
    int peak=findPeak(mountainArr);
    int index=orderAgnosticBs(target, mountainArr, peak, mountainArr.length());
    if(index!=-1){
        return index;
    }
    return -1;

    public static void main(String[] args) {
        int arr[]={1,2,3,4, 5,3,1};

    }
}
