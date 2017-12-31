package com.lucciola.result

class HttpErrorResult(arg0: String) : AbstructResult(arg0) {

    override// TODO Auto-generated method stub
    val message: String
        get() = this.httpStatusCode

}
