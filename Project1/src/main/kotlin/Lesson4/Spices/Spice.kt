package Spices

import java.awt.Color
import java.awt.Label

fun main() {
    Curry(name = "curry", spiciness = "mild")

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}

abstract class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder{
    override fun prepareSpice() {
        grind()
    }

    override fun grind(){

    }
}

interface Grinder{
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color = Color.YELLOW
}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}


