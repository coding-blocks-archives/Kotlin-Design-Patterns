package com.codingblocks.carpicker.vehicle

import com.codingblocks.carpicker.vehicle.parts.Engine
import com.codingblocks.carpicker.vehicle.parts.WheelBase

class Vehicle {
    val wheelBase: WheelBase = WheelBase()
    val engine: Engine = Engine()

    val price: Int get() {
        var costs = 0
        costs += wheelBase.price
        costs += wheelBase.chasis.price
        costs += wheelBase.wheels.sumBy { it.price }
        costs += wheelBase.chasis.seats.sumBy { it.price }
        costs += engine.price
        costs += engine.transmission.price
        return costs
    }
}