package test

import org.junit.Assert.*

import org.junit.Test

import com.lucciola.haskell.StringAnalyzer

class StringAnalyzerTest {

    @Test
    fun test() {
        val analyzer = StringAnalyzer("let one = 1")
        assertEquals(analyzer.isMain, false)
        assertEquals(analyzer.text, "one = 1")

        val analyzer1 = StringAnalyzer("\"Hello, world\"")
        assertEquals(analyzer1.isMain, true)
        assertEquals(analyzer1.text, "\"Hello, world\"")
    }

}
