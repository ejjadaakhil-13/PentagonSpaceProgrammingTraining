
public class trianglepattern2 {
    public static void main(String[] args) {
        for(int i=1;i<=5;++i){  // describe the rows
            for(int j=5;j>=i;--j){  // describe the columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}


/*
* * * * *

* * * *

* * *

* *

*

*/
