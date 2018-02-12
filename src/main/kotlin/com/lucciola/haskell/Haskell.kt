package com.lucciola.haskell

import com.lucciola.result.CommunicationResult

class Haskell {

    private val compiler: RexTester = RexTester()
    private var program: String = ""
    private var input: String = ""

    fun run(): CommunicationResult {
        // in Kotlin, to generate between non-null type and nullable type, using !! operator
        return this.compiler.post(this.program, this.input)
    }

    fun setProgram(arg0: String?) {
        if (arg0 != null) {
            this.program = arg0
        } else {
            this.program = ""
        }
    }

    fun setInput(arg0: String?) {
        if (arg0 != null) {
            this.input = arg0
        } else {
            this.input = ""
        }
    }

    fun getProgram(): String? {
        return this.program
    }

    fun getInput(): String? {
        return this.input
    }

}
