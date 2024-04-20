package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() {
		Reporter.log("--------------Job1 - Login------------");
		org.testng.Assert.fail();
	}
}
