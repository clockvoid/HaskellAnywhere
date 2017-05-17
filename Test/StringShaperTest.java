package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import core.HaskellAnywhere;
import result.CommunicationResult;

public class StringShaperTest {

	@Test
	public void test() {
		HaskellAnywhere shaper = new HaskellAnywhere();
		CommunicationResult result = shaper.input("\"Hello, world\"");
		
		assertEquals(result.getMessage(), "\\\"Hello, world\\\"\\n");
	}

}
