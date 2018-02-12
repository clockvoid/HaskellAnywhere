package com.lucciola.haskell

import java.util.regex.Pattern

class StringAnalyzer(arg0: String) {

    var text: String = arg0
        private set

    val isMain: Boolean
        get() {
            val pattern = Pattern.compile("(\\Alet\\s.*)|(\\Aimport\\s.*)")
            val matcher = pattern.matcher(this.text)
            if (matcher.matches()) {
                this.text = this.text.replaceFirst("let\\s".toRegex(), "")
                return false
            } else {
                return true
            }
        }

}
