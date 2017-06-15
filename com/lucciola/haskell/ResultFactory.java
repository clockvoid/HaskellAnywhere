package com.lucciola.haskell;

import com.lucciola.result.AddDefineResult;
import com.lucciola.result.CommunicationResult;
import com.lucciola.result.ExceptionResult;
import com.lucciola.result.HaskellResult;
import com.lucciola.result.HttpErrorResult;

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
