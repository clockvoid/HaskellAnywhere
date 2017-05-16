package Core;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class RegexTester {
	
	private CloseableHttpClient httpClient;
	private String url = "http://rextester.com/rundotnet/api";
	private HttpPost postMethod;
	
	public RegexTester() {
		this.httpClient = HttpClients.createDefault();
		this.postMethod = new HttpPost(url);
		postMethod.addHeader("Access-Control-Allow-Origin", "http://rextester.com");
	}
	
	public String post(String arg0, String arg1) {
		String result = "";
		
		List<BasicNameValuePair> params = new ArrayList<BasicNameValuePair>();
		params.add(new BasicNameValuePair("LanguageChoice", "11"));
		params.add(new BasicNameValuePair("Program", arg0));
		params.add(new BasicNameValuePair("Input", arg1));
		params.add(new BasicNameValuePair("CompilerArgs", "-o a.out source_file.hs"));
		
		try {
			this.postMethod.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
			CloseableHttpResponse response = httpClient.execute(postMethod);
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				HttpEntity entity = response.getEntity();
				result = EntityUtils.toString(entity, StandardCharsets.UTF_8);
			}
		} catch (IOException e) {
			result = e.getMessage();
		}
		
		return result;
	}

}