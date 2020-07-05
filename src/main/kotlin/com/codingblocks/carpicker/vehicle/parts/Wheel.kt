package com.codingblocks.carpicker.vehicle.parts

class Wheel : Part {
    override val selfPrice: Int
        get() = 12000

    override val totalCost = selfPrice
}