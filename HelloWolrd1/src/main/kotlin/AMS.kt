import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")
    feedTheFish()
    eagerExample()
}

fun eagerExample()
{
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    val lazyMap = decorations.asSequence().map {
        println("map: $it")
    }
    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}

fun feedTheFish()
{
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day))
    {
        println("Change the water today")
    }
    swim(time = 50, speed = "slow")

    dirtyProcessor()
}



fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

var dirty = 20
var waterFilter: (Int) -> Int = {dirty -> dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int{
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, :: feedFish)
    dirty = updateDirty(dirty) {dirty -> dirty + 50}
}


fun isTooHot(temperature: Int ): Boolean = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun swim(time: Int, speed: String = "fast")
{
    println("swimming $speed")
}

fun swim(){

}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String) : String {

    return when(day){
        "Monday" ->  "flakes"
        //"Tuesday" ->  "pallets"
        "Wednesday" ->  "redworms"
        "Thursday" ->  "granules"
        "Friday" ->  "mosquitoes"
        //"Saturday" ->  "lettuce"
        "Sunday" ->  "plankton"
        else -> "fasting"
    }
}




/*var bubble = 0
while (bubble < 50)
{
    bubble++
}

repeat(times = 2) {
    println("A fish is swimming")
}*/

/*println(if (args[0].toInt() < 12) "Good morning, Kotlin"
else "Good night, Kotlin")
*/
/*

val isUnit = println("This is an expression")
print(isUnit)

val temperature = 10
val isHot = if (temperature > 50) true else false
println(isHot)

val message = "You are ${if (temperature > 50) "fried" else "safe" } fish"
println(message)*/