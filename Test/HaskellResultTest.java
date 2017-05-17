package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import result.CommunicationResult;
import result.HaskellResult;

public class HaskellResultTest {

	@Test
	public void test() {
		CommunicationResult result = new HaskellResult("{\"Warnings\":null,\"Errors\":null,\"Result\":\"[\\\"test\\\",\\\"test1\\\"]\\n\",\"Stats\":\"Compilation time: 0.52 sec, absolute running time: 0.14 sec, cpu time: 0 sec, memory peak: 3 Mb, absolute service time: 0,67 sec\",\"Files\":null}");
		assertEquals(result.getWarnings(), "null");
		assertEquals(result.getErrors(), "null");
		assertEquals(result.getResult(), "[\"test\",\"test1\"]\n");
		assertEquals(result.getStats(), "Compilation time: 0.52 sec, absolute running time: 0.14 sec, cpu time: 0 sec, memory peak: 3 Mb, absolute service time: 0,67 sec");
		assertEquals(result.getMessage(), "[\"test\",\"test1\"]\n");
	}

}
