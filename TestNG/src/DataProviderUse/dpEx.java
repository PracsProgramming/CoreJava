package DataProviderUse;

import org.testng.annotations.DataProvider;

public class dpEx {


  @DataProvider
  public Object[][] LoginData() {
    return new Object[][] {
      new Object[] { "kiran@gmail.com", "123456","JavaByKiran | Dashboard" },
      new Object[] { "mangesh@gmail.com", "sahsda" ,"JavaByKiran | Log in" },
      new Object[] {"prachi@gmail.com" ,"987008" ,"JavaByKiran | Log in" }
    };
  }
  
  @DataProvider
  public Object[][] AddNewMember() {
    return new Object[][] {
    	//(String uname,String mobile,String Email,String Password)
      new Object[] { "abc","1234567890","abc@gmail.com", "123456" },
      new Object[] { "pqr","9999999999","pqr@gmail.com", "234567" },
      new Object[] { "xyz","1111111111","xyz@gmail.com", "345678" },
      new Object[] { "lmn","4545454544","lmn@gmail.com", "456789" }
    };
  }
  
}


//