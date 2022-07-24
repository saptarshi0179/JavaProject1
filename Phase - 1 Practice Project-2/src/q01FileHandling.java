import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class q01FileHandling {
	
	 void createFile() {
		
		try{
		File f=new File("MyFileSaptarshi.txt");
		if(f.createNewFile()) {
			System.out.println("File created"+f.getName());
		}
		else {
			System.out.println("file already exists");
		}
		}
		catch(IOException e) {
			System.out.println("an error occur");
			e.printStackTrace();
		}
}
	
	 void readFile() {
		try {  
            // Create f1 object of the file to read data  
            File f1 = new File("MyFileSaptarshi.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
	
	 void writeToFile() {
		
		try {  
	        FileWriter fwrite = new FileWriter("MyFileSaptarshi.txt");  
	        // writing the content into the FileOperationExample.txt file  
	        fwrite.write("Hello anyone, whoever is reading this. Saptarshi here.");   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    	} catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        }  
	    }  
	
	 void appendToFile() {
		try {
		File file = new File("MyFileSaptarshi.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(" This is append to the existing file");

		br.close();
		fr.close();
		}
		catch(IOException e) {
			System.out.println("Unexpected error occurred"); 
			e.printStackTrace();  
		}
	}
	
	public static void main(String []args) {
		q01FileHandling objfile= new q01FileHandling();
	          objfile.writeToFile();
	          objfile.readFile();
              objfile.appendToFile();
              objfile.readFile();
}
}