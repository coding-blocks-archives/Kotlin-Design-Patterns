package com.codingblocks.carpicker.vehicle.parts.wheel

class AlloyWheel (
    override val diaInch: Int,
    override val widthInch: Int
) : Wheel {
    override val type: Wheel.Type = Wheel.Type.ALLOY
    override val basePrice: Int = 800
}

class SteelWheel (
    override val diaInch: Int,
    override val widthInch: Int
) : Wheel {
    override val type: Wheel.Type = Wheel.Type.STEEL
    override val basePrice: Int = 750
}


class CarbonFibreWheel (
    override val diaInch: Int,
    override val widthInch: Int
) : Wheel {
    override val type: Wheel.Type = Wheel.Type.CARBONFIBRE
    override val basePrice: Int = 1100
}

