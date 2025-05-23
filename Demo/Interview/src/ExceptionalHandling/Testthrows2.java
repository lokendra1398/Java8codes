package ExceptionalHandling;

import java.io.*;  

class dummy{  
    void method() throws IOException {  
        System.out.println("device operation performed");  
    }  
}  

class Testthrows2 {  
    public static void main(String args[]) throws IOException { // Declaring exception
        dummy m = new dummy();  //yha try catch na use krke declare krdia 
        m.method();  // No try-catch, exception propagates to JVM

        System.out.println("normal flow...");  
    }  
} 