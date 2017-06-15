package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lucciola.result.AddDefineResult;
import com.lucciola.result.CommunicationResult;

public class AddDefineResultTest {

	@Test
	public void test() {
		CommunicationResult result = new AddDefineResult("{\"AddedDefine\":\"pluse = 1 + 1\"}");
		assertEquals(result.getMessage(), "pluse = 1 + 1");
	}

}
