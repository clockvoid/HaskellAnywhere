package test

import org.junit.Assert.*

import org.junit.Test

import com.lucciola.result.CommunicationResult
import com.lucciola.result.HaskellResult

class HaskellResultTest {

    @Test
    fun test() {
        val result = HaskellResult("{\"Warnings\":null,\"Errors\":null,\"Result\":\"[\\\"test\\\",\\\"test1\\\"]\\n\",\"Stats\":\"Compilation time: 0.52 sec, absolute running time: 0.14 sec, cpu time: 0 sec, memory peak: 3 Mb, absolute service time: 0,67 sec\",\"Files\":null}")
        assertEquals(result.warnings, "null")
        assertEquals(result.errors, "null")
        assertEquals(result.result, "[\"test\",\"test1\"]\n")
        assertEquals(result.stats, "Compilation time: 0.52 sec, absolute running time: 0.14 sec, cpu time: 0 sec, memory peak: 3 Mb, absolute service time: 0,67 sec")
        assertEquals(result.message, "[\"test\",\"test1\"]\n")
    }

}
