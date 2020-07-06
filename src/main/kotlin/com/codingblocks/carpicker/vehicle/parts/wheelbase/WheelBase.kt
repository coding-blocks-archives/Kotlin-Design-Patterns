package com.codingblocks.carpicker.vehicle.parts.wheelbase

import com.codingblocks.carpicker.vehicle.parts.Part
import com.codingblocks.carpicker.vehicle.parts.wheel.Wheel

interface WheelBase : Part {
    enum class Size { SMALL, MEDIUM, LARGE }

    val size: Size
    val wheels: List<Wheel>

    override val totalCost: Int
        get() = selfPrice + wheels.sumBy { it.totalCost }


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
            val wheels = this.wheelFactory.createWheels(
                numWheels =  4 + if (this.spareWheel) 1 else 0
            )
            return when (this.size) {
                Size.SMALL -> SmallWheelBase(wheels)
                Size.MEDIUM -> MediumWheelBase(wheels)
                Size.LARGE -> LargeWheelBase(wheels)
            }
        }
    }

}