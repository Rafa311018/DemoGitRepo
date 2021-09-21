import java.util.*

//val rollDice = { Random().nextInt(12) + 1 }

fun main(args: Array<String>) {
    println(rollDice)

    gamePlay(rollDice2(10))
}

val rollDice = {sides: Int -> if (sides == 0) 0 else Random().nextInt(sides) + 1}

val rollDice2: (Int) -> Int = {sides -> if (sides == 0) 0 else Random().nextInt(sides) + 1}


fun gamePlay(diceRoll: Int)
{
    println(diceRoll)
}