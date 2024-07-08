package happyNumber;

public class happynumber {
static int happycat(int num){

    int sum=0;
    int rem=0;
    while(num>0){
        rem=num%10;
        sum=sum+(rem*rem);
        num=num/10;
    }

    if((sum==1) || (sum==4)){
        if(sum==1){
            System.out.println("it's a happy number");
        }
        else{
            System.out.println("it's not a happy number");
        }
    }

    else{
        int temp=sum;
        return happycat(temp);
    }
return 1;

}

    public static void main(String[] args) {
        int num=33;
        happycat(num);
    }
    
}
