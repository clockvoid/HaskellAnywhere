package com.lucciola.result

class HaskellResult(arg0: String) : AbstractResult(arg0) {

    override val httpStatusCode: String
        get() = "200"

    override val message: String
        get() {
            when {
                this.warnings == "null" && this.errors == "null" -> return this.result
                this.warnings == "null" -> return this.errors
                else -> return this.warnings
            }
        }

}
