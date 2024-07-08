// // Structure of recursive Method: 
// 1) design the method declaration
// a)return type
// b)parameter[define based on the logic and the values that has to be carry forwarded]
// 2) include the logic
// 3)recursive call
// 4)base condition


class program1{
    //called method/ recursive method
static void disply(int n){ //method declaration parameter
    if (n==0){
        return;
    }
    System.out.println("method executed:"+n); //logic
    disply(--n); //recursive call
}
public static void main(String[] args) {
    disply(5); // method call
}
}