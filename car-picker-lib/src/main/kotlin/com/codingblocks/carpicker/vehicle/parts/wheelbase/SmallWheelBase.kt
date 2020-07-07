package com.codingblocks.carpicker.vehicle.parts.wheelbase

import com.codingblocks.carpicker.vehicle.parts.wheel.Wheel

class SmallWheelBase(override val wheels: List<Wheel>) : WheelBase {
    override val size = WheelBase.Size.SMALL

    override val selfPrice: Int = 100000
}