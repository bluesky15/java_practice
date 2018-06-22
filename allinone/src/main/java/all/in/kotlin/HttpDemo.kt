package all.`in`.kotlin

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main(args: Array<String>) {
    val url = "http://www.google.com/"
    val obj = URL(url)

    with(obj.openConnection() as HttpURLConnection) {
        // optional default is GET
        requestMethod = "GET"


        println("\nSending 'GET' request to URL : $url")
        println("Response Code : $responseCode")

        BufferedReader(InputStreamReader(inputStream)).use {
            val response = StringBuffer()

            var inputLine = it.readLine()
            while (inputLine != null) {
                inputLine = it.readLine()
                response.append(inputLine)
            }
            println(response.toString())
        }
    }
}

//fun main(vararg args: String) {
//    val response = try {
//        URL("https://developer.android.com")
//                .openStream()
//                .bufferedReader()
//                .use { it.readText() }
//    } catch (e: IOException) {
//        "Error with ${e.message}."
//    }
//    println(response)
//}