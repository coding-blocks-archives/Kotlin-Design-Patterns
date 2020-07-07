package com.codingblocks.carpicker.vehicle.parts.seat

class ClothSeat private constructor() : Seat {
    override val upholstery = Seat.Upholstery.CLOTH
    override val selfPrice: Int = 10000

    companion object {
        fun create() = ClothSeat()
    }
}

class RexineSeat private constructor() : Seat {
    override val upholstery = Seat.Upholstery.REXINE
    override val selfPrice: Int = 15000

    companion object {
        fun create() = RexineSeat()
    }
}

class LeatherSeat private constructor() : Seat {
    override val upholstery = Seat.Upholstery.LEATHER
    override val selfPrice: Int = 20000

    companion object {
        fun create() = LeatherSeat()
    }
}