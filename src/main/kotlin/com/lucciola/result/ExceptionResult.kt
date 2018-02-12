package com.lucciola.result

class ExceptionResult(arg0: String) : AbstractResult(arg0) {

    override val message: String
        get() = this.exception

}
