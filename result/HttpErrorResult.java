package result;

public class HttpErrorResult extends AbstructResult {
	
	public HttpErrorResult(String arg0) {
		super(arg0);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getHttpStatusCode();
	}

}
