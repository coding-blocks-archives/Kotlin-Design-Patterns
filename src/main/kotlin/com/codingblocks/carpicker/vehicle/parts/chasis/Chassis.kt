package com.codingblocks.carpicker.vehicle.parts.chasis

import com.codingblocks.carpicker.vehicle.parts.Part
import com.codingblocks.carpicker.vehicle.parts.seat.Seat

interface Chassis : Part {
    enum class Type { HATCHBACK, SEDAN, SUV, PICKUP }

    val type: Type
    val seats: List<Seat>

    override val selfPrice: Int
        get() = when (this.type) {
            Type.HATCHBACK -> 150000
            Type.SEDAN -> 200000
            Type.SUV -> 250000
            Type.PICKUP -> 350000
        }
    override val totalCost: Int
        get() = selfPrice + seats.sumBy { it.totalCost }


    class Builder {
        private lateinit var chasisType: Type
        private lateinit var seatFactory: Seat.Factory

        fun setChasisType(chasisType: Type): Builder {
            this.chasisType = chasisType
            return this
        }

        fun setSeatFactory(seatFactory: Seat.Factory): Builder {
            this.seatFactory = seatFactory
            return this
        }


        fun build(): Chassis {
            val numSeats = when (this.chasisType) {
                Type.HATCHBACK -> 4
                Type.SEDAN -> 5
                Type.SUV -> 8
                Type.PICKUP -> 6
            }
            val seats = this.seatFactory.createSeats(numSeats)
            return when (this.chasisType) {
                Type.HATCHBACK -> HatchbackChassis(seats)
                Type.SEDAN -> SedanChassis(seats)
                Type.SUV -> SuvChassis(seats)
                Type.PICKUP -> PickupChassis(seats)
            }

        }
    }
}