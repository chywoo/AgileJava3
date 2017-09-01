import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionTest{

	@Test
	public void testCreate(){
		
		Condition c1 = new Condition(0, 0);
		c1.out();
		assertEquals(0, c1.getResult());
		
		Condition c2 = new Condition(20, 20);
		c2.out();
		assertEquals(100, c2.getResult());
	}
	
	
}
