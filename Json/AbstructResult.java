package Json;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstructResult implements CommunicationResult {
	
	protected String json;
	protected Map<String, String> jsonMap;
	
	public AbstructResult(String arg0) {
		this.json = arg0.replaceAll("[{}]", "");
		this.jsonMap = this.analyze(this.json);
	}

	@Override
	public Map<String, String> getJsonMap() {
		// TODO Auto-generated method stub
		return this.jsonMap;
	}

	@Override
	public String getJson() {
		// TODO Auto-generated method stub
		return this.json;
	}

	@Override
	public Map<String, String> analyze(String arg0) {
		// TODO Auto-generated method stubString tmpJson = arg0;
		String tmpJson = arg0;
		String[] stringList = tmpJson.split("(\")?,\"");
		Map<String, String> tmpMap = new HashMap<String, String>();
		for (String str : stringList) {
			tmpMap.put(str.split("\":(\")?")[0].replaceAll("^\\\"", ""), str.split("\":(\")?")[1].replaceAll("^\\\"", ""));
		}
		return tmpMap;
	}

	@Override
	public String getResult() {
		String result = this.jsonMap.get("Result");
		return result == null ? "" : result;
	}
	
	@Override
	public String getWarnings() {
		String result = this.jsonMap.get("Warnings");
		return result == null ? "" : result;
	}
	
	@Override
	public String getErrors() {
		String result = this.jsonMap.get("Errors");
		return result == null ? "" : result;
	}
	
	@Override
	public String getStats() {
		String result = this.jsonMap.get("Stats");
		return result == null ? "" : result;
	}
	
	@Override
	public String getFiles() {
		String result = this.jsonMap.get("Files");
		return result == null ? "" : result;
	}

	@Override
	public String getAddedDefine() {
		// TODO Auto-generated method stub
		String result = this.jsonMap.get("AddedDefine");
		return result == null ? "" : result;
	}


	@Override
	public String getException() {
		// TODO Auto-generated method stub
		String result = this.jsonMap.get("Exception");
		return result == null ? "" : result;
	}
	
	@Override
	public String getHttpStatusCode() {
		String result = this.jsonMap.get("HttpStatusCode");
		return result == null ? "" : result;
	}

}
