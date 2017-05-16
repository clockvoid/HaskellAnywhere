package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Core.StringShaper;

public class StringShaperTest {

	@Test
	public void test() {
		StringShaper shaper = new StringShaper();
		String result = shaper.input("\"Hello, world\"");
		
		assertEquals(result, "\\\"Hello, world\\\"\\n");
	}

}
