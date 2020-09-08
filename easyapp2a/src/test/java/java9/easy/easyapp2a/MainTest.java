package java9.easy.easyapp2a;

import static org.junit.Assert.*;
import static java9.easy.easyapp2a.TestUtils.*;
import org.junit.Test;

public class MainTest {

	
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }


}
