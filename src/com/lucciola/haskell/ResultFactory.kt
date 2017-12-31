package com.lucciola.haskell

import com.lucciola.result.AddDefineResult
import com.lucciola.result.CommunicationResult
import com.lucciola.result.ExceptionResult
import com.lucciola.result.HaskellResult
import com.lucciola.result.HttpErrorResult

object ResultFactory {

    fun createAddDefineResult(arg0: String): CommunicationResult {
        return AddDefineResult(arg0)
    }

    fun createExceptionResult(arg0: String): CommunicationResult {
        return ExceptionResult(arg0)
    }

    fun createHaskellResult(arg0: String): CommunicationResult {
        return HaskellResult(arg0)
    }

    fun createHttpErrorResult(arg0: String): CommunicationResult {
        return HttpErrorResult(arg0)
    }
}
