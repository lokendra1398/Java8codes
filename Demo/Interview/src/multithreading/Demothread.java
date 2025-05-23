package multithreading;


//two ways of defining thread : 1)Extending thread class  2)using runnable interface
 class demo extends Thread{
	
	
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	
}
 
  class demo2 implements Runnable{


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread 2 is also running");
	}
	 
 }
 

public class Demothread  {
	
	

	public static void main(String args[]) {
		
		demo t1  = new demo();
		t1.start();
		

		demo2 runnable  = new demo2();
		Thread t2 = new Thread(runnable);
		t2.start();
		
	}

}
