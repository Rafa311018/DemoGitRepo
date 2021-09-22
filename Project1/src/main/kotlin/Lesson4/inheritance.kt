package Aquarium

fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction2 {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus2(fishColor: FishColor = GoldColor):
    FishAction2 by PrintingFishAction("a lot of algae"),
        FishColor by GoldColor

object GoldColor: FishColor {
    override val color = "gold"
}

object  RedColor: FishColor{
    override val color = "red"
}

class PrintingFishAction(val food:String): FishAction2 {
    override fun eat() {
        println(food)
    }
}

abstract class AquariumFish2: FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}