package assingment;

public class assingment {
    public static void main(String[] args) {
        int arr1[]={50};
        int arr2[]={10,20};
        int size=arr1.length+arr2.length;
        int i=0, j=0;
        int res[] =new int[size];
        int len=arr1.length;

        // merging

        for(int k=0;k<=res.length-1;k++){
            if(len!=0){
                res[k]=arr1[i];
                ++i;
                --len;
            }
            else{
                res[k]=arr2[j];
                ++j;
            }
        }

        // sorting

        int temp=res[0];
        for(int k=0;k<=res.length-1;k++){
            for(int z=0;z<=res.length-1;z++){
            if(res[k]<res[z]){
                temp=res[z];
                res[z]=res[k];
                res[k]=temp;
            }
            }
        }

        // printing

        System.out.println("now sorting: ");
        for(i=0;i<=res.length-1;++i){
            System.out.print(res[i] + " ");

        }
    }
}
