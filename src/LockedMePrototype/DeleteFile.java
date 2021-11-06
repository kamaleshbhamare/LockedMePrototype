package LockedMePrototype;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	DeleteFile(String fileName) throws IOException {
		
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
		
	}
}
