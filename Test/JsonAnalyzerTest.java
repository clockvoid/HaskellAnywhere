package Test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import Core.JsonAnalyzer;

public class JsonAnalyzerTest {

	@Test
	public void test() {
		JsonAnalyzer analyzer = new JsonAnalyzer("{\"Warnings\":null,\"Errors\":null,\"Result\":\"[\\\"test\\\",\\\"test1\\\"]\\n\",\"Stats\":\"Compilation time: 0.52 sec, absolute running time: 0.14 sec, cpu time: 0 sec, memory peak: 3 Mb, absolute service time: 0,67 sec\",\"Files\":null}");
		Map<String, String> map = analyzer.analyze();
		assertEquals(map.get("Result"), "[\\\"test\\\",\\\"test1\\\"]\\n");
	}

}
