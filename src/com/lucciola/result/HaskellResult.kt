package com.lucciola.result

class HaskellResult(arg0: String) : AbstructResult(arg0) {

    override val httpStatusCode: String
        get() = "200"

    override// TODO Auto-generated method stub
    val message: String
        get() {
            var result = ""
            if (this.warnings == "null" && this.errors == "null") {
                result = this.result
            } else if (this.warnings == "null") {
                result = this.errors
            } else {
                result = this.warnings
            }
            return result
        }

}
