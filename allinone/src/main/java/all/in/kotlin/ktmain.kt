package all.`in`.kotlin

import com.all.other.Address
import com.all.other.Animal

fun main(args: Array<String>) {
    println("hello")
    val tiger = Animal("tiger")
    println(tiger.getName())
    val a = Address()
    a.name = "some"
}