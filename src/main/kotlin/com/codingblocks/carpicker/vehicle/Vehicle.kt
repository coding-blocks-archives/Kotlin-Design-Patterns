package com.codingblocks.carpicker.vehicle

import com.codingblocks.carpicker.vehicle.parts.Chasis
import com.codingblocks.carpicker.vehicle.parts.Engine
import com.codingblocks.carpicker.vehicle.parts.WheelBase

class Vehicle private constructor(
    val wheelBase: WheelBase,
    val chasis: Chasis,
    val engine: Engine
) {
    val price = (wheelBase.totalCost + engine.totalCost + chasis.totalCost)

    class Builder {
        private lateinit var wheelBase: WheelBase
        private lateinit var chasis: Chasis
        private lateinit var engine: Engine

        fun setWheelBase(wheelBase: WheelBase): Builder {
            this.wheelBase = wheelBase
            return this
        }
        fun setChasis(chasis: Chasis): Builder {
            this.chasis = chasis
            return this
        }
        fun setEngine(engine: Engine): Builder {
            this.engine = engine
            return this
        }

        fun build(): Vehicle {
            return Vehicle(
                this.wheelBase,
                this.chasis,
                this.engine
            )
        }

    }
}