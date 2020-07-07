package com.codingblocks.carpicker.vehicle.parts.wheelbase

import com.codingblocks.carpicker.vehicle.parts.wheel.Wheel

class LargeWheelBase(override val wheels: List<Wheel>) : WheelBase {
    override val size = WheelBase.Size.LARGE

    override val selfPrice: Int = 175000

}