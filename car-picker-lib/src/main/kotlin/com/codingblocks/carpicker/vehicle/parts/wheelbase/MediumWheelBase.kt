package com.codingblocks.carpicker.vehicle.parts.wheelbase

import com.codingblocks.carpicker.vehicle.parts.wheel.Wheel

class MediumWheelBase(override val wheels: List<Wheel>) : WheelBase {
    override val size = WheelBase.Size.MEDIUM

    override val selfPrice: Int = 125000

}