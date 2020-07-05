package com.codingblocks.carpicker.vehicle.parts

class WheelBase(
    val size: Size,
    val chasis: Chasis,
    val wheelFactory: Wheel.Factory,
    val spareWheel: Boolean = false
) : Part {

    val numWheels = 4 + (if (spareWheel) 1 else 0)

    val wheels: List<Wheel> = generateSequence { wheelFactory.createWheel() }.take(numWheels).toList()

    override val selfPrice: Int
        get() = when (this.size) {
            Size.SMALL -> 100000
            Size.MEDIUM -> 125000
            Size.LARGE -> 175000
        }
    override val totalCost: Int
        get() = selfPrice + chasis.totalCost + wheels.sumBy { it.totalCost }

    enum class Size { SMALL, MEDIUM, LARGE }

}