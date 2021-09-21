import java.util.*
import java.util.Calendar.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val day =  getInstance().get(DAY_OF_WEEK)
    when(day){
        1-> print("Sunday")
        2-> print("Monday")
        3-> print("Tuesday")
        4-> print("Wednesday")
        5-> print("Thursday")
        6-> print("Friday")
        7-> print("Saturday")
    }
}