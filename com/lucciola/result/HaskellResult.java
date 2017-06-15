package com.lucciola.result;

public class HaskellResult extends AbstructResult {

	public HaskellResult(String arg0) {
		super(arg0);
	}
	
	@Override
	public String getHttpStatusCode() {
		return "200";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String result = "";
		if (this.getWarnings().equals("null") && this.getErrors().equals("null")) {
			result = this.getResult();
		} else if (this.getWarnings().equals("null")) {
			result = this.getErrors();
		} else {
			result = this.getWarnings();
		}
		return result;
	}

}
