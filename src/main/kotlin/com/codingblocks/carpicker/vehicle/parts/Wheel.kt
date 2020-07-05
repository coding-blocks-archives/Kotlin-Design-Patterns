package com.codingblocks.carpicker.vehicle.parts

class Wheel private constructor(
    val type: Type
) : Part {
    override val selfPrice: Int
        get() = when (this.type) {
            Type.STEEL -> 10000
            Type.ALLOY -> 12000
            Type.CARBONFIBRE -> 20000
        }

    override val totalCost = selfPrice

    enum class Type { STEEL, ALLOY, CARBONFIBRE }

    class Factory(
        val type: Type
    ) {

        fun createWheels(numWheels: Int): List<Wheel> {
            return generateSequence { Wheel(type) }.take(numWheels).toList()
        }
    }
}