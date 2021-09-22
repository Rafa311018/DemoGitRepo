enum class Direction {
    NORTH, SOUTH, EAST , WEST, START, END
}

class Game() {
    var path = mutableListOf<Direction>(Direction.START)
    val north = {path.add(Direction.NORTH)}
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = { path.add(Direction.END); println("Game Over: "); println(path); path.clear(); false }

    fun makeMove(move: String?) {
        move(north)
    }
}

fun main(args: Array<String>) {
    val game = Game()

    while (true){
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}

fun move(where: () -> Boolean ) {
    where.invoke()
}

fun updateLocation() {

}

class Location {
    val width = 4
    val height = 4
    val map = Array(width) { arrayOfNulls<String>(height) }

    init {
        map
    }
}