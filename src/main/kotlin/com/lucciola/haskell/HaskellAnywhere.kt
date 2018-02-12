package com.lucciola.haskell

import com.lucciola.result.CommunicationResult

class HaskellAnywhere {

    var program: String = ""
        private set
    var mainFunction: String = ""
        private set
    private val defaultMainFunction = "main = print $ "
    private val compiler: RexTester = RexTester()

    fun input(arg0: String): CommunicationResult {
        val result: CommunicationResult
        val analyzer = StringAnalyzer(arg0)
        if (analyzer.isMain) {
            mainFunction = this.defaultMainFunction
            mainFunction += analyzer.text
            result = submit()
        } else {
            program += analyzer.text + "\n"
            result = ResultFactory.createAddDefineResult("{\"AddedDefine\":\"" + analyzer.text + "\"}")
        }
        return result
    }

    fun submit(): CommunicationResult {
        return this.compiler.post(program + mainFunction, "")
    }

}
