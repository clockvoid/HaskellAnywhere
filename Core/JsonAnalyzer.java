package Core;

import java.util.HashMap;
import java.util.Map;

public class JsonAnalyzer {
	
	private Map<String, String> jsonMap;
	private String json;
	
	public JsonAnalyzer(String arg0) {
		this.json = arg0.replaceAll("[{}]", "");
		jsonMap = new HashMap<String, String>();
	}
	
	public Map<String, String> analyze() {
		String[] stringList = this.json.split("(\")?,\"");
		for (String str : stringList) {
			jsonMap.put(str.split("\":(\")?")[0].replaceAll("^\\\"", ""), str.split("\":(\")?")[1].replaceAll("^\\\"", ""));
		}
		return this.jsonMap;
	}

}
