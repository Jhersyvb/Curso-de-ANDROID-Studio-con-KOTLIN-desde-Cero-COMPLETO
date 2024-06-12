package dev.jhersy.androiddesdecero

class Person(val name: String, val age: Int)

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print(sum(2, 3))

    val p = Person("Sara", 55)
    if (p.age > 18) {
        print(p.name)
    }

    val list = listOf(1, 2, 3, 4, 5)
    for (x in list) {
        println(x)
    }

    val list2 = list + 6
    for (x in list2) {
        println(x)
    }

    when (p.age) {
        in 0..10 -> println("10")
        in 15..20 -> println("20")
        else -> println("not found")
    }
}
