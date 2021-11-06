package LockedMePrototype;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.InvalidPathException;
import java.nio.file.AccessDeniedException;

public class AddFile  {

    AddFile(String filePath) throws IOException {
    	
        try {
            Path newFilePath = Paths.get(LockedMe.currentDir + "/" + filePath);
            Files.createFile(newFilePath);
            System.out.println("File is created. Path: " + newFilePath + "");
        } catch (InvalidPathException e) {
        	System.out.println("File not created. Error:" + e + "");        
	    } catch (AccessDeniedException e) {
	    	System.out.println("File not created. Error:" + e + "");
	    } 
    
    }
}
