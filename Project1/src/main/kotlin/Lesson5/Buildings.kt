package Buildings

fun main(args: Array<String>) {
    Building(Wood()).build()
    isSmallBuilding(Building(Brick()))
}

open class BaseBuildingMaterial() {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial> (val buildingMaterial: T) {
    var baseMaterialsNeeded = 100
    var actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} requiered")
    }
}

fun<T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small Building")
    else println("large Building")
}

