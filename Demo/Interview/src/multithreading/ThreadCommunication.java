//package multithreading;


//This was incorrect code
//
//
//class Q{
//	
//	
//	int num;
//	
//	public  synchronized void put(int num) {
//		System.out.println("put: " + num);
//		this.num = num;
//	}
//	
//	public 
//	synchronized void get()
//	{
//		System.out.println("get: " + num);
//	}
//	
//}
//
//class Producer implements Runnable{
//	
//	Q q;
//   
//	public Producer(Q q) {
//	
//		this.q = q;
//		 Thread t = new Thread(this,"Producer");
//		    t.start();
//	}
//	public void run() {
//		int i =0;
//		while(true)
//		{
//			
//			q.put(i++);
//			try{Thread.sleep(1000);
//		}
//		catch(Exception e) {
//			
//		}
//	}
//	
//}}
//	
//	class Consumer implements Runnable
//	{
//		Q q;
//
//		public Consumer(Q q) {
//		
//			this.q = q;
//			 Thread t = new Thread(this,"Consumer");
//			    t.start();
//		}
//		public void run()
//		{
//			while(true)
//			{
//				q.get();
//				try{Thread.sleep(1000);}
//				catch(Exception e) {}
//			}
//		}
//	}
//
//
//public class ThreadCommunication {
//	
//	
//	public static void main(String args[]) {
//		
//		Q q = new Q();
//		new Producer(q);
//		new Consumer(q);// anonymous object
//		
//		
//		
//		
//	}
//
//}

package multithreading;

class Q {
//Yeh code is tarah design hai ki initially koi bhi thread execute hosakti hai
    int num;
    boolean valueSet = false; // Tracks if data is available to consume

    public synchronized void put(int num) {//producer will hold the lock inside put menthod
        while (valueSet) { // Wait if the previous value hasn't been consumed 
        	              //agar producer gyada fast hua or  subsequently try krega put krne ki value to valueSet true hga 
        	             //to nhi ni krpayega or wait me chala jayega.
            try {
                wait(); // Wait until the consumer reads the value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("put: " + num);
        this.num = num;
        valueSet = true; // Mark that a new value has been produced
        notify(); // Notify the consumer thread
    }

    public synchronized void get() {
        while (!valueSet) { // Wait if no value is available to consume
            try {
                wait(); // Wait until the producer writes a value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get: " + num);
        valueSet = false; // Mark that the value has been consumed
        notify(); // Notify the producer thread
    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            q.get();
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadCommunication {

    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q); // Anonymous object
    }
}

