fun main(args: Array<String>) {
    val fortune = getFortuneCookie()
    println("Your fortune is: $fortune")
}

fun getFortuneCookie() : String {
    val lisfOfFortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    var fortune : Int = 0
    var count = 1
    while (!( count > 10 || fortune == 5)) {
        val birthday: Int?
        println("Enter your birthday")
        birthday = readLine()?.toIntOrNull() ?: 1
        fortune = birthday / lisfOfFortunes.size
        println(lisfOfFortunes[fortune])
        count++
    }
    return lisfOfFortunes[fortune]
}
