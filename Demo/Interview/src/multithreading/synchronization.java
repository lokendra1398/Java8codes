package multithreading;
//Example of sychronization in thread
class Counter
{
	int count;
	
	public synchronized void increment()//after using synchronized method ye 1 bar hi chala and 
	//we had made this method thread safe.
	
	{
		count++;
	}
	
}


public class synchronization {

	public static void main(String args[]) throws Exception{
		Counter c = new Counter();
	
	Thread t1 = new Thread(new Runnable() {
	    @Override
	    public void run() {
	        // Code to execute in the thread
//	        System.out.println("Thread is running");
	        
	        
	        for(int i=0;i<=1000;i++) {
	        	c.increment();
	        }
	    }
	});
	
	Thread t2 = new Thread(new Runnable() { //yha pura runnable class implement na krni ki jagah
		                                    //direct new runnable ki annonymous inner class bnadi
	    @Override
	    public void run() {
	        // Code to execute in the thread
	     
	        
	        
	        for(int i=0;i<=1000;i++) {
	        	c.increment();
	        }
	    }
	});

	// Start the thread
	t1.start();
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println("Count" + c.count);
}
}