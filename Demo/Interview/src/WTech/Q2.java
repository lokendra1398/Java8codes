package WTech;

public class Q2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		Runnable t1 = ()->
		
		
			{
				for(int i=0;i<3;i++) {
				System.out.println( "Thread1" + "  " + i);}
			
			}
			;
			
			
			Runnable t2 = ()->
			
			
			{
				for(int i=3;i<7;i++) {
				System.out.println("Thread2" + "  "  + i);}
			
			}
			;
			Runnable t3 = ()->
			
			
			{
				for(int i=7;i<=10;i++) {
 				System.out.println("Thread3" + "  " + i);}
			
			}
			;
			
			
			Thread task1= new Thread(t1);
            Thread task2= new Thread(t2);
			Thread task3= new Thread(t3);
			task1.start();
			task1.join();
            task2.start();
            task2.join();
            task3.start();
            task3.join();
			
	}

}
