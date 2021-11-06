package LockedMePrototype;

import java.io.File;
import java.io.IOException;

public class SearchFiles {
	SearchFiles(String searchStr) throws IOException {
		
		File fileDir = new File(LockedMe.currentDir);
		
		Boolean foundAnyFile = false;
	
		String[] list = fileDir.list();

		System.out.println("Search result:");
		
		if (list.length > 0) {
			for(String curFileName:list){
				if(curFileName.contains(searchStr)) {
					foundAnyFile = true;
					System.out.println("- " + curFileName);
				}
			}
		}
		
		if(!foundAnyFile) {
			System.out.println("Sorry, we did not find any file which has " + searchStr+" in the file name.");			
		}
		
	}
}
