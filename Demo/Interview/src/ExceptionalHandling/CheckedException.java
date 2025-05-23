package ExceptionalHandling;
import java.io.*;

class CheckedException {

	
	
	    static void readFile() throws IOException {  // Must declare checked exception
	        FileReader file = new FileReader("test.txt"); // May throw IOException
	    }

	    public static void main(String[] args) {
	        try {
	            readFile();  // Must hlpandle IOException
	        } catch (IOException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
