package com.lucciola.haskell

import java.util.regex.Matcher
import java.util.regex.Pattern

class StringAnalyzer(arg0: String) {

    var text: String? = null
        private set

    val isMain: Boolean
        get() {
            val pattern = Pattern.compile("(\\Alet\\s.*)|(\\Aimport\\s.*)")
            val matcher = pattern.matcher(this.text!!)
            if (matcher.matches()) {
                this.text = this.text!!.replaceFirst("let\\s".toRegex(), "")
                return false
            } else {
                return true
            }
        }

    init {
        this.text = arg0
    }

}
