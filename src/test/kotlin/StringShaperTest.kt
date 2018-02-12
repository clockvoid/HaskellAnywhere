package test

import org.junit.Assert.*

import org.junit.Test

import com.lucciola.haskell.HaskellAnywhere
import com.lucciola.result.CommunicationResult

class StringShaperTest {
    @Test
    fun test() {
        val shaper = HaskellAnywhere()
        val result = shaper.input("\"Hello, world\"")

        assertEquals("\"Hello, world\"\n", result.message)
    }
}
