package ExceptionalHandling;

import java.io.IOException;

class test{  
    void method() throws IOException {  
    	 throw new IOException("device error");  
    }  
}  

    
public class TestThrow3 {
	public static void main(String args[]) throws IOException { // Declaring exception
        test m = new test();  //yha try catch na use krke declare krdia or exception agya
        
        m.method();  // No try-catch, exception propagates to JVM

        System.out.println("normal flow...");  
    }  
}
