package Java8Features;

public class ThreadwithLamda {
	
	
	
	public static void main(String[] args) {
		
		Runnable runnable = ()->{
			
			for (int i =0;i<10;i++)
			{
				System.out.println(i);
			}
		};
		Thread ch = new Thread(runnable);
		ch.run();
		
		
		
	}

}
