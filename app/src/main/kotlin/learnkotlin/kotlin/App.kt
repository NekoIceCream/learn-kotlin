/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 
 I Love Kotlin - NekoIceCream
 */

package learnkotlin.kotlin

class App {
    val greeting: String
        get() {
            return "Hello "
}
}

fun main() {
    val name = "NekoIceCream"
    println(App().greeting)
    print(name)
    print(if (true) "Always true" else "Always false")
}
