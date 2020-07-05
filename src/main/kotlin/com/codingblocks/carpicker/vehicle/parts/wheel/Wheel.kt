package com.codingblocks.carpicker.vehicle.parts.wheel

import com.codingblocks.carpicker.vehicle.parts.Part


interface Wheel : Part {

    val diaInch: Int
    val widthInch: Int
    val type: Wheel.Type
    val basePrice: Int

    override val selfPrice get() = basePrice * diaInch * widthInch
    override val totalCost get() = selfPrice

    enum class Type { STEEL, ALLOY, CARBONFIBRE }

    // Abstract factory pattern
    class Factory private constructor(
        val type: Type
    ) {
        fun createWheels(
            diaInch: Int = 16,
            widthInch: Int = 8,
            numWheels: Int = 4
        ): List<Wheel> {
            return generateSequence {
                when (type) {
                    Type.STEEL -> SteelWheel(diaInch, widthInch)
                    Type.ALLOY -> AlloyWheel(diaInch, widthInch)
                    Type.CARBONFIBRE -> CarbonFibreWheel(diaInch, widthInch)
                }
            }.take(numWheels).toList()
        }

        companion object {
            fun alloyWheelFactory() = Factory(Type.ALLOY)
            fun steelWheelFactory() = Factory(Type.STEEL)
            fun carbonFibreWheelFactory() = Factory(Type.CARBONFIBRE)
        }
    }

}