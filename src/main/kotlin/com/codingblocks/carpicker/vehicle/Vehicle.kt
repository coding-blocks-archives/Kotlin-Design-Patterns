package com.codingblocks.carpicker.vehicle

import com.codingblocks.carpicker.vehicle.parts.chasis.Chassis
import com.codingblocks.carpicker.vehicle.parts.engine.Engine
import com.codingblocks.carpicker.vehicle.parts.wheelbase.WheelBase

class Vehicle private constructor(
    val wheelBase: WheelBase,
    private val chassis: Chassis,
    private val engine: Engine
) {
    val price = (wheelBase.totalCost + engine.totalCost + chassis.totalCost)

    class Builder {
        private lateinit var wheelBase: WheelBase
        private lateinit var chassis: Chassis
        private lateinit var engine: Engine

        fun setWheelBase(wheelBase: WheelBase): Builder {
            this.wheelBase = wheelBase
            return this
        }
        fun setChasis(chassis: Chassis): Builder {
            this.chassis = chassis
            return this
        }
        fun setEngine(engine: Engine): Builder {
            this.engine = engine
            return this
        }

        fun build(): Vehicle {
            return Vehicle(
                this.wheelBase,
                this.chassis,
                this.engine
            )
        }

    }
}