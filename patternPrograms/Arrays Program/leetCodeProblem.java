public class leetCodeProblem {
    public static void main(String[] args) {
        int arr[]={5,7,9};
        int key=3;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<=key){
                key=key+1;
            }
            else{
                break;
            }
        }
        System.out.println(key);
    }
}

