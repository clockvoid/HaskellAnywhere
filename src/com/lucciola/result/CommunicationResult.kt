package com.lucciola.result

interface CommunicationResult {

    val jsonMap: Map<String, String>
    val json: String
    val warnings: String
    val errors: String
    val result: String
    val stats: String
    val files: String
    val httpStatusCode: String
    val addedDefine: String
    val exception: String
    val message: String
    fun analyze(arg0: String): Map<String, String>

}
