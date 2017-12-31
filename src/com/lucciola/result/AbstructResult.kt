package com.lucciola.result

import java.util.HashMap
import org.json.JSONException
import org.json.JSONObject

abstract class AbstructResult(arg0: String) : CommunicationResult {

    // TODO Auto-generated method stub
    override var json: String = arg0
        protected set
    // TODO Auto-generated method stub
    override var jsonMap: Map<String, String> = this.analyze(this.json)
        protected set

    override val result: String
        get() {
            val result = this.jsonMap["Result"]
            return result ?: ""
        }

    override val warnings: String
        get() {
            val result = this.jsonMap["Warnings"]
            return result ?: ""
        }

    override val errors: String
        get() {
            val result = this.jsonMap["Errors"]
            return result ?: ""
        }

    override val stats: String
        get() {
            val result = this.jsonMap["Stats"]
            return result ?: ""
        }

    override val files: String
        get() {
            val result = this.jsonMap["Files"]
            return result ?: ""
        }

    override// TODO Auto-generated method stub
    val addedDefine: String
        get() {
            val result = this.jsonMap["AddedDefine"]
            return result ?: ""
        }


    override// TODO Auto-generated method stub
    val exception: String
        get() {
            val result = this.jsonMap["Exception"]
            return result ?: ""
        }

    override val httpStatusCode: String
        get() {
            val result = this.jsonMap["HttpStatusCode"]
            return result ?: ""
        }

    override fun analyze(arg0: String): Map<String, String> {
        // TODO Auto-generated method stubString tmpJson = arg0;
        val tmpMap = HashMap<String, String>()
        try {
            val `object` = JSONObject(arg0)
            val keysItr = `object`.keys()
            while (keysItr.hasNext()) {
                val key = keysItr.next()
                val value = `object`[key] //don't input double hierarchy json...

                tmpMap.put(key, if (value === JSONObject.NULL) "null" else value.toString()) //refer to twitter4j's JSONObject
            }
        } catch (e: JSONException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }

        return tmpMap
    }

}
