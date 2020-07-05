package com.codingblocks.carpicker.vehicle.parts

class Chasis(
    val type: Type,
    val seatFactory: Seat.Factory
) : Part {

    val numSeats: Int = when (this.type) {
        Type.HATCHBACK -> 4
        Type.SEDAN -> 5
        Type.SUV -> 8
        Type.PICKUP -> 6
    }

    val seats: List<Seat> = generateSequence { seatFactory.createSeat() }.take(numSeats).toList()
    
    override val selfPrice: Int
        get() = when (this.type) {
            Type.HATCHBACK -> 150000
            Type.SEDAN -> 200000
            Type.SUV -> 250000
            Type.PICKUP -> 350000
        }
    override val totalCost: Int
        get() = selfPrice + seats.sumBy { it.totalCost }

    enum class Type { HATCHBACK, SEDAN, SUV, PICKUP }
}