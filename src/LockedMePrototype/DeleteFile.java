package LockedMePrototype;

import java.io.File;
import java.util.InputMismatchException;

public class DeleteFile {
	DeleteFile(String fileName) throws InputMismatchException {
		
		try {
			File fileDir = new File(LockedMe.currentDir);
			
			String[] list = fileDir.list();
			
			if (list.length==0) {
				System.out.println("No files found.");
			} else {
				for(String curFileName:list){
					if(fileName.equals(curFileName)) {
						File fileToDelete = new File(fileDir+"/"+fileName);
						fileToDelete.delete();
						System.out.println("File " + fileName + " is deleted.");
						return;
					}
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Please try again.");
			// System.out.println("InputMismatchException " + e + "Please try again.");
		} 		
		
	}
}
