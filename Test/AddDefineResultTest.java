package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import result.AddDefineResult;
import result.CommunicationResult;

public class AddDefineResultTest {

	@Test
	public void test() {
		CommunicationResult result = new AddDefineResult("{\"AddedDefine\":\"pluse = 1 + 1\"}");
		assertEquals(result.getMessage(), "pluse = 1 + 1");
	}

}
