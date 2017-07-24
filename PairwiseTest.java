import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PairwiseTest {
	
	private static final String EOL = System.getProperty("line.separator");
	
	//Test that the program exits with 0 parameter
	@Test
	public void testNoParameter(){
		int numArgs = args.length;
		assertEquals(numArgs, 0);
	}
	
	//Test that the program exits with 1 parameter
	@Test
	public void testOneParameter(){
		int numArgs = args.length;
		assertEquals(numArgs, 1);
	}
	
	//Test that the program continues with 2 parameters
	@Test
	public void testTwoParameter() {
		int numArgs = args.length;
		assertEquals(numArgs, 2);
	}
	
	//Test that the program continues with more than 2 parameters
	@Test
	public void testMultParameter() {
		int numArgs = args.length;
		assertEquals(numArgs, 3);
	}
	
	//Test that the program's name is "Pairwise"
	@Test
	public void testProgramName() {
		
		assertEquals(Pairwise, new Object());
	}
	
	//Test that the parameter types are boolean
	@Test
	public void testParamType() {
		
	}
	
	//test that the outputs are 1 or 0 for true or false
	@Test
	public void testOutput() {
		
	}
	
	
	
}
