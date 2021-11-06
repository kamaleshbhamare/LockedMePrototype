package LockedMePrototype;

import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LockedMe {
	
	static String currentDir; 
	
    public static void main(String[] args) throws IOException {
    	
    	System.out.println("\n");
    	System.out.println("Welcome to LockedMe.com");
        System.out.println("Products Digitization Application Prototype");
        
    	currentDir = Paths.get("./Files").toAbsolutePath().normalize().toString();
    	Path path = Paths.get(currentDir); 
    	
    	if(!Files.isDirectory(path)) {
    		System.out.println("\n");
    		System.out.println("Directory does not exists. Creating new directory " + currentDir + "");
	    	new File(currentDir +"").mkdirs();
    	}
        
        showHome();
    }
    
    private static void showHome() throws IOException {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("\n");
        System.out.println("Home");
        System.out.println("(Press 1, 2 or 3 to perform respective action.)");
        System.out.println("1. Show files");
        System.out.println("2. Business operations");
        System.out.println("3. Exit Application");

        int n = input.nextInt();
        
        switch (n) {
	        case 1: 
	        	new ShowFiles();
	            
	            showHome();
	            break;
	            
	        case 2: 
	        	showBusinessOperations();
	        	
	            break;
	            
	        case 3: 
	        	System.out.println("\n");
	            System.out.println("Thank you for using 'LockedMe.com'...");
	            input.close();
	            
	            break;
	
	        default:
	        	System.out.println("\n");
	        	System.out.println("Wrong entry. Please try again.");
	        	showHome();
	        	
	            break;
        }
        
	}
    
    
    /**
     * @throws IOException
     */
    private static void showBusinessOperations() throws IOException {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("\n");
        System.out.println("Business Operations");
        System.out.println("(Press 1, 2, 3 or 4 to perform respective action.)");
        System.out.println("1. Add new file");
        System.out.println("2. Delete existing file");
        System.out.println("3. Search files");
        System.out.println("4. Go back to Home menu");

        int n = input.nextInt();
        
        switch (n) {
	        case 1: 
	            System.out.println("Please enter file name: ");
	            
	            Scanner fileNameInput = new Scanner(System.in);  
	    		String fileName = fileNameInput.nextLine();
	    		
	    		new AddFile(fileName);
	    		
	    		showBusinessOperations();
	    		
	            break;                         
	        case 2: 
	        	System.out.println("Please enter file name: ");
	            
	            Scanner fileNameToDelInput = new Scanner(System.in);  
	    		String fileNameToDel = fileNameToDelInput.nextLine();
	    		
	    		new DeleteFile(fileNameToDel);
	    		
	    		showBusinessOperations();
	    		
	            break;                         
	        case 3 : 
	        	System.out.println("Please enter search text: ");
	            
	            Scanner searchStrInput = new Scanner(System.in);  
	    		String searchStr = searchStrInput.nextLine();
	    		
	            new SearchFiles(searchStr);
	            
	            showBusinessOperations();
	            
	            break;
	
	        case 4 : 
	            showHome();
	            break;
	
	        default:
	        	System.out.println("\n");
	        	System.out.println("Wrong entry. Please try again. \n ");
	        	
	        	showBusinessOperations();
	            break;
        }
        input.close();
	}
    
}
