package exponentialCalculation;


import java.util.Scanner;

public class demotask1 implements Runnable{

	public demotask1() {
		Thread t1= new Thread(this);
		t1.start();
		
	}
	
	public void run() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user Name: ");
		String us=sc.next();
		System.out.println("Enter the password: ");
		int pwd=sc.nextInt();
		System.out.println("collect cash");
	}

}

class Task2 implements Runnable{
	Task2(){
		Thread t2= new Thread();
		
	}
	
	public void run() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("ABC");
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}

class Task3 implements Runnable{
	Task3(){
		
	}
		Thread t3=new Thread(this);
		public void run() {
			int a,b,c;
			a=1000;
			b=8000;
			c=a+b;
			System.out.println(c);
		
	}

	
}

class MainDemo{
	public static void main(String[] args) {
		demotask1 t1=new demotask1();
		Thread x= new Thread(t1);
		Task2 t2=new Task2();
		Thread y=new Thread(t2);
		Task3 t3=new Task3();
		Thread z= new Thread(t3);
		x.start();
		y.start();
		z.start();
		
	}
}
