class Spice (val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when( spiciness ) {
                "mild" -> 1
                "medium" -> 2
                "spicy" -> 3
                "very spicy" -> 4
                "extremely spicy" -> 5
                else -> 0
            }
        }
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    init {
        val spice = Spice("paprika", spiciness = "medium")
        println("name: ${spice.name} " +
                "spiciness: ${spice.spiciness}")
    }

    val spicelist = spices1.filter { it.heat > 5 }
}

fun makeSalt() = Spice("Salt")