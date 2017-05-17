package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Core.StringShaper;
import Json.CommunicationResult;

public class StringShaperTest {

	@Test
	public void test() {
		StringShaper shaper = new StringShaper();
		CommunicationResult result = shaper.input("\"Hello, world\"");
		
		assertEquals(result.getMessage(), "\\\"Hello, world\\\"\\n");
	}

}
