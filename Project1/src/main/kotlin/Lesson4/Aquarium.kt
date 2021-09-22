package Aquarium.Aquarium

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

        open var volume: Int
                get() = width * height * length / 1000
                set(value) {(height * 1000) / width * length}

        open var water = volume * .9

        constructor(numberOfFish: Int): this() {
                val water:Int = numberOfFish * 2000 //cm3
                val tank:Double = water + water *.1
                height = (tank / (length * width)).toInt()
        }
}

class ToweTank(): Aquarium() {
        override var water = volume * .8

        override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
                height = (value * 1000) / (width * length) }
}