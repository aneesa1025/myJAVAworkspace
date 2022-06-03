package institution.librarymgmt;

import org.junit.Before;
import org.junit.Test;

import com.intf.example.impt.FinanceEmployee;


public class FinanceEmployeeTest {
	FinanceEmployee financeEmployee = null;
	@Before
	public void setup() {
		financeEmployee = new FinanceEmployee();
			
	}
	@Test
	 public void getJobTypeTest() {
		String expectedJobType = "Accountant";
		String JobType = financeEmployee.getJobType();
		
	}

	
	
	

}
