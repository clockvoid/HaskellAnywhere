package com.lucciola.result

class HttpErrorResult(arg0: String) : AbstractResult(arg0) {

    override val message: String
        get() = this.httpStatusCode

}
