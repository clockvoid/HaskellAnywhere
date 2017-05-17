package Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

import Core.RegexTester;
import Json.CommunicationResult;

public class RegexTesterTest {

	@Test
	public void test() {
		RegexTester tester = new RegexTester();
		
		CommunicationResult result = tester.post("main = print \"Hello world\"", "");
			
		assertThat(result.getMessage(), containsString("Hello world"));
			
	}

}
