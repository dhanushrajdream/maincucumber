package com.properties;

public class File_Reader_Manager {
	
	//private constructor
	
		private File_Reader_Manager() {
			
			//we cannot create object in another class(and we should not do)
			
		}
		
		//static method
		public static File_Reader_Manager getInstanceFRM() {
			
			File_Reader_Manager frm = new File_Reader_Manager();
			
			return frm;

		} 
	    
		//non static method
		
		public Configuration_Reader getInstanceCR() throws Throwable {
			
			Configuration_Reader cr = new Configuration_Reader();
			
			return cr;
			
		}

}
