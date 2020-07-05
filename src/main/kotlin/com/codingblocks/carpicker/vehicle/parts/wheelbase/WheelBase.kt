package com.codingblocks.carpicker.vehicle.parts.wheelbase

import com.codingblocks.carpicker.vehicle.parts.Part
import com.codingblocks.carpicker.vehicle.parts.wheel.Wheel

class WheelBase private constructor(
    val size: Size,
    val wheels: List<Wheel>
) : Part {

    override val selfPrice: Int
        get() = when (this.size) {
            Size.SMALL -> 100000
            Size.MEDIUM -> 125000
            Size.LARGE -> 175000
        }
    override val totalCost: Int
        get() = selfPrice + wheels.sumBy { it.totalCost }

    enum class Size { SMALL, MEDIUM, LARGE }

    class Builder {
        private lateinit var size: Size
        private lateinit var wheelFactory: Wheel.Factory
        private var spareWheel: Boolean = false

        fun setSize(size: Size): Builder {
            this.size = size
            return this
        }

        fun setWheelFactory(wheelFactory: Wheel.Factory): Builder {
            this.wheelFactory = wheelFactory
            return this
        }

        fun setSpareWheel(spareWheel: Boolean): Builder {
            this.spareWheel = spareWheel
            return this
        }

        fun build(): WheelBase {
            return WheelBase(
                this.size,
                this.wheelFactory.createWheels(
                    numWheels =  4 + if (this.spareWheel) 1 else 0
                )
            )
        }
    }

}