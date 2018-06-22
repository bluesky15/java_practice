package all.`in`.kotlin.inactiondemo

data class Person(val name: String,// data class
                  val age: Int? = null)// nullable type

fun main(args: Array<String>) {// top- level function
    val Persons = listOf(Person("Alice"), Person("Bob", 29))// named argument.
}
