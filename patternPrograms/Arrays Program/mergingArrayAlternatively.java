public class mergingArrayAlternatively {
        public static void main(String[] args) {

            int[] arr1={100};
            int[] arr2={10,20,30,40,50,60};
            int size=arr1.length+arr2.length;
            int[] res = new int[size];
            int i=0,j=0,k;
            for(k=0;k<res.length;k++){
                if(i<arr1.length && k%2==0){
                    res[k]=arr1[i];
                    i++;
                }
                else if(j<arr2.length && k%2!=0){
                    res[k]=arr2[j];
                    j++;
                }
                else{
                    if(arr1.length<arr2.length){
                        res[k]=arr2[j];
                        j++;
                    }
                    else{
                        res[k]=arr1[i];
                        i++;
                    }
                }
            }
        for(int h=0;h<res.length;h++){
            System.out.println(res[h]);
        }
    
    }
}
