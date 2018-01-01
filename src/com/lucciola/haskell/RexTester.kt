package com.lucciola.haskell

import java.io.IOException
import java.util.ArrayList

import org.apache.http.HttpStatus
import org.apache.http.client.entity.UrlEncodedFormEntity
import org.apache.http.client.methods.HttpPost
import org.apache.http.impl.client.CloseableHttpClient
import org.apache.http.impl.client.HttpClients
import org.apache.http.message.BasicNameValuePair
import org.apache.http.util.EntityUtils

import com.lucciola.result.CommunicationResult

class RexTester {

    private val httpClient: CloseableHttpClient = HttpClients.createDefault()
    private val url = "http://rextester.com/rundotnet/api"
    private val postMethod: HttpPost = HttpPost(this.url)

    init {
        postMethod.addHeader("Access-Control-Allow-Origin", "http://rextester.com")
    }

    fun post(arg0: String, arg1: String): CommunicationResult {
        var result: CommunicationResult

        val params = ArrayList<BasicNameValuePair>()
        params.add(BasicNameValuePair("LanguageChoice", "11"))
        params.add(BasicNameValuePair("Program", arg0))
        params.add(BasicNameValuePair("Input", arg1))
        params.add(BasicNameValuePair("CompilerArgs", "-o a.out source_file.hs"))

        try {
            this.postMethod.entity = UrlEncodedFormEntity(params, "UTF-8")
            val response = httpClient.execute(postMethod)
            if (response.statusLine.statusCode == HttpStatus.SC_OK) {
                val entity = response.entity
                result = ResultFactory.createHaskellResult(EntityUtils.toString(entity, "UTF-8"))
            } else {
                result = ResultFactory.createHttpErrorResult("{\"HttpStatusCode\":\"" + Integer.toString(response.statusLine.statusCode) + "\"}")
            }
        } catch (e: IOException) {
            result = ResultFactory.createExceptionResult("{\"Exception\":\"" + e.message + "\"}")
        }

        return result
    }

}
