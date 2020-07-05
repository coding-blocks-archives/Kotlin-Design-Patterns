package com.codingblocks.carpicker.vehicle.parts

class Seat private constructor(
    val upholstery: Upholstery
) : Part {

    override val selfPrice: Int
        get() = when (this.upholstery) {
            Upholstery.CLOTH -> 10000
            Upholstery.REXINE -> 15000
            Upholstery.LEATHER -> 20000
        }

    override val totalCost = selfPrice

    enum class Upholstery { CLOTH, REXINE, LEATHER }

    class Factory(val upholstery: Upholstery) {

        fun createSeats(numSeats: Int): List<Seat> {
            return generateSequence { Seat(upholstery) }.take(numSeats).toList()
        }
    }
}