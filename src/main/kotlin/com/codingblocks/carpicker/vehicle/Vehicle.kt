package com.codingblocks.carpicker.vehicle

import com.codingblocks.carpicker.vehicle.parts.Engine
import com.codingblocks.carpicker.vehicle.parts.WheelBase

class Vehicle(
    val wheelBase: WheelBase,
    val engine: Engine
) {
    val price = (wheelBase.totalCost + engine.totalCost)
}