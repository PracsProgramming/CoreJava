package TenTestCases;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@Test(dataProvider = "dataProviderMethod")
	public void f(String un, String s) {
		System.out.println(un);
		System.out.println(s);
	}
	
	@DataProvider
	public Object[][] dataProviderMethod(){
//		return new Object[][] {
//			new Object[] {1,"a"},
//			new Object[] {2,"b"},
//		};
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "kiran@gmail.com";
		data[0][1] = "123456";
		
		data[1][0] = "amol@gmail.com";
		data[1][1] = "123456";
			
		
		
		return data;
		
	
	}
	

}
