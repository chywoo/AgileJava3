import static org.junit.Assert.*;

import org.junit.Test;

public class BranchTest{

//	@Test
	public void testCreate(){
		Branch a100 = new Branch(10);
		a100.out();
		assertEquals(100, a100.getResult());
		
		Branch a80 = new Branch(80);
		a80.out();
		assertEquals(80, a80.getResult());
		
		
	}
	
	
}
