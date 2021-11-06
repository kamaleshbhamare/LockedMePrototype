package LockedMePrototype;

import java.io.IOException;
import java.io.File;
import java.util.Arrays;

public class ShowFiles {

	ShowFiles() throws IOException {
		
		File fileDir = new File(LockedMe.currentDir);
	
		String[] list = fileDir.list();
		
		if (list.length==0) {
			System.out.println("No files found.");
		} else {
			
			// Sorting the file
			Arrays.sort(list);
			
			for(String fileName:list){
				System.out.println(fileName);
			}
		}
		
	}
	
}