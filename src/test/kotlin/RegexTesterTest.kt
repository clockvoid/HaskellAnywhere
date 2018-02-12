package test

import org.junit.Assert.*

//import org.hamcrest.CoreMatchers.containsString

import org.junit.Test

import com.lucciola.haskell.RexTester
import com.lucciola.result.CommunicationResult

class RegexTesterTest {

    @Test
    fun test() {
        val tester = RexTester()

        val result = tester.post("main = print \"Hello world\"", "")

        //assertThat(result.message, containsString("Hello world"))

    }

}
