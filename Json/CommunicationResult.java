package Json;

import java.util.Map;

public interface CommunicationResult {

	public Map<String, String> getJsonMap();
	public String getJson();
	public Map<String, String> analyze(String arg0);
	public String getWarnings();
	public String getErrors();
	public String getResult();
	public String getStats();
	public String getFiles();
	public String getHttpStatusCode();
	public String getAddedDefine();
	public String getException();
	public String getMessage();
	
}
