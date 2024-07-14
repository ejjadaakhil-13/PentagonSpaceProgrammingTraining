public class oddNumberRightAngleTriangle {
    public static void main(String[] args) {
        int n=4, odd=1, num1, num2;
        for(int i=1; i<=n; i++){
            num1=i;
            num2=2;
                for(int j=1;j<=odd;j++){
                    if(num1>=1){
                        System.out.print(num1+" ");
                        num1--;
                    }
                    else{
                        System.out.print(num2+" ");
                        num2++;
                    }
                }
            System.out.println();
            odd+=2;
        }
    }
}


/*




1
2 1 2
3 2 1 2 3
4 3 2 1 2 3 4



 */
