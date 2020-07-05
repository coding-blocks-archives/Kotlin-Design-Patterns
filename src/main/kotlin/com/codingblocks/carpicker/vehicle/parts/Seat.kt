package com.codingblocks.carpicker.vehicle.parts

class Seat : Part {

    override val selfPrice: Int
        get() = 15000

    override val totalCost = selfPrice
}