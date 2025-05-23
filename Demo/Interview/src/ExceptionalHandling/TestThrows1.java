package ExceptionalHandling;
import java.io.*;  

class M {  
    void method() throws IOException {  
        throw new IOException("device error");  // Checked Exception (IOException)
    }  
}  

public class TestThrows1 {  
    public static void main(String args[]) {  //yha na to declare kara na hi propogate karne ki 
    	                                     //jrurat padi kyoki try catch se handle hgya 
        try {  
            M m = new M();  
            m.method();  // IOException may be thrown
        } catch (Exception e) {  
            System.out.println("exception handled");  // Exception is caught here
        }     

        System.out.println("normal flow...");  
    }  
}  