package test

import org.junit.Assert.*

import org.junit.Test

import com.lucciola.result.AddDefineResult
import com.lucciola.result.CommunicationResult

class AddDefineResultTest {

    @Test
    fun test() {
        val result = AddDefineResult("{\"AddedDefine\":\"pluse = 1 + 1\"}")
        assertEquals(result.message, "pluse = 1 + 1")
    }

}
