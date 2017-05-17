package Core;

import Json.AddDefineResult;
import Json.CommunicationResult;
import Json.ExceptionResult;
import Json.HaskellResult;
import Json.HttpErrorResult;

public class ResultFactory {
	
	public static CommunicationResult createAddDefineResult(String arg0) {
		return new AddDefineResult(arg0);
	}
	
	public static CommunicationResult createExceptionResult(String arg0) {
		return new ExceptionResult(arg0);
	}
	
	public static CommunicationResult createHaskellResult(String arg0) {
		return new HaskellResult(arg0);
	}

	public static CommunicationResult createHttpErrorResult(String arg0) {
		return new HttpErrorResult(arg0);
	}
}
