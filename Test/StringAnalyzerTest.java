package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lucciola.haskell.StringAnalyzer;

public class StringAnalyzerTest {

	@Test
	public void test() {
		StringAnalyzer analyzer = new StringAnalyzer("let one = 1");
		assertEquals(analyzer.isMain(), false);
		assertEquals(analyzer.getText(), "one = 1");
		
		StringAnalyzer analyzer1 = new StringAnalyzer("\"Hello, world\"");
		assertEquals(analyzer1.isMain(), true);
		assertEquals(analyzer1.getText(), "\"Hello, world\"");
	}

}
