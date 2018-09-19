package com.demoSeleniumPlus.Day1;

import org.testng.annotations.Test;

public class DataProvider {
     @Test(dataProvider="getData")
	public void testCase(String cname, String cpass) {
		System.out.println(cname+"==========="+cpass);
     }
		@org.testng.annotations.DataProvider
//		public Object[][] getData(){
//			Object obj[][]= {{"Anu","pass1"},
//			                 {"Anu2","pass2"}
//			
//			
//			};
//		return obj;
//		}
		public String[][] getData(){
			String obj[][]= {{"Anu",""},
			                 {"Anu2",""}
			
			
			};
		return obj;
		}

	
	
	
}
