package com.codingblocks.carpicker.vehicle

import com.codingblocks.carpicker.vehicle.parts.chassis.Chassis
import com.codingblocks.carpicker.vehicle.parts.engine.Engine
import com.codingblocks.carpicker.vehicle.parts.wheelbase.WheelBase

interface Vehicle {
    val wheelBase: WheelBase
    val chassis: Chassis
    val engine: Engine

    val price get() = (wheelBase.totalCost + engine.totalCost + chassis.totalCost)

    class Builder {
        private lateinit var wheelBase: WheelBase
        private lateinit var chassis: Chassis
        private lateinit var engine: Engine

        fun setWheelBase(wheelBase: WheelBase): Builder {
            this.wheelBase = wheelBase
            return this
        }

        fun setChassis(chassis: Chassis): Builder {
            this.chassis = chassis
            return this
        }

        fun setEngine(engine: Engine): Builder {
            this.engine = engine
            return this
        }

        fun build(): Vehicle = object : Vehicle {
            override val wheelBase = this@Builder.wheelBase
            override val chassis = this@Builder.chassis
            override val engine = this@Builder.engine
        }

    }
}