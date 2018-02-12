import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

import com.lucciola.haskell.*

object Main {

    @Throws(IOException::class)
    private fun inputString(): String {
        var result = ""
        val reader = BufferedReader(InputStreamReader(System.`in`))
        result = reader.readLine()
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // TODO Auto-generated method stub

        val shaper = HaskellAnywhere()

        var inputBuffere: String
        while (true) {
            try {
                inputBuffere = inputString()
                if (inputBuffere == "quit") {
                    break
                } else {
                    println(shaper.input(inputBuffere).message)
                }
            } catch (e: IOException) {
                // TODO Auto-generated catch block
                e.printStackTrace()
            }

        }

    }

}
