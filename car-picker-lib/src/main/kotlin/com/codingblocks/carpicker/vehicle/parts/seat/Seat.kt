package com.codingblocks.carpicker.vehicle.parts.seat

import com.codingblocks.carpicker.vehicle.parts.Part

interface Seat : Part {
    val upholstery: Upholstery

    override val totalCost get() = selfPrice

    enum class Upholstery { CLOTH, REXINE, LEATHER }

    class Factory(val upholstery: Upholstery) {

        fun createSeats(numSeats: Int): List<Seat> {
            return generateSequence {
                when (upholstery) {
                    Upholstery.CLOTH -> ClothSeat.create()
                    Upholstery.REXINE -> RexineSeat.create()
                    Upholstery.LEATHER -> LeatherSeat.create()
                }
            }.take(numSeats).toList()
        }
    }
}