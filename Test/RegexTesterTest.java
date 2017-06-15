package test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

import com.lucciola.haskell.RexTester;
import com.lucciola.result.CommunicationResult;

public class RegexTesterTest {

	@Test
	public void test() {
		RexTester tester = new RexTester();
		
		CommunicationResult result = tester.post("main = print \"Hello world\"", "");
			
		assertThat(result.getMessage(), containsString("Hello world"));
			
	}

}
