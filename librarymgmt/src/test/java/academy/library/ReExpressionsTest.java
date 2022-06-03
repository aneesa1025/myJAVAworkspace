package academy.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReExpressionsTest {
	private ReExpressions email = null;
	@Before
	public void setup() {
		email = new ReExpressions();
	}
	
	@Test
	public void validateTest1() {
		Assert.assertFalse("aneesa123@gmail.com", false);
		
	}
	 public void validateTest2() {
		 Assert.assertTrue("aneesa1025@gmail.com", true);
		
	}
}
