package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Core.StringAnalyzer;

public class StringAnalyzerTest {

	@Test
	public void test() {
		StringAnalyzer analyzer = new StringAnalyzer("let one = 1");
		assertEquals(analyzer.isMain(), false);
		assertEquals(analyzer.getText(), "one = 1");
	}

}
