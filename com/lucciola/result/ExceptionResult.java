package com.lucciola.result;

public class ExceptionResult extends AbstructResult {
	
	public ExceptionResult(String arg0) {
		super(arg0);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getException();
	}

}
