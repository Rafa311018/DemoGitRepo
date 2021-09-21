import com.sun.org.apache.xpath.internal.operations.Bool
import sun.font.Decoration

fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tanksize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean
{
    var totalLength = if (hasDecorations) tanksize * .8 else tanksize
    println(totalLength)

    var lengthOfFishes = currentFish.sum()
    println(lengthOfFishes)

    totalLength -= lengthOfFishes
    println(totalLength)

    return if(fishSize <= totalLength)  true else false
}