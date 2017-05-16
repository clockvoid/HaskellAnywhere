package Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

import Core.RegexTester;

public class RegexTesterTest {

	@Test
	public void test() {
		RegexTester tester = new RegexTester();
		
		String[] results = tester.post("main = print \"Hello world\"", "").split(",");
			
		for (String result : results) {
			if (result.contains("Result")) {
				String mainContent = result.split(":")[1];
				assertThat(mainContent, containsString("Hello world"));
			}
		}
			
	}

}
