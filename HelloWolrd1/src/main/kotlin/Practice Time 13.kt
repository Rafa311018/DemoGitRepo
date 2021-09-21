fun main(args: Array<String>) {
    println("How do you feel?")
    val mood = readLine()!!
    whatShouldIDoToday(mood = mood, weather = "sunny", temperature = 40)
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24)
{
    println(
    when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go to swimming"
        else -> "Stay home and read."
    })
}