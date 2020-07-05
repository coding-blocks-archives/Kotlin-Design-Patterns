package com.codingblocks.carpicker.vehicle.parts

class Engine(
    val type: Type,
    val transmission: Transmission
) : Part {

    override val selfPrice: Int
        get() = when (this.type) {
            Type.PETROL -> 100000
            Type.DIESEL -> 200000
            Type.HYBRID -> 500000
            Type.ELECTRIC -> 400000
        }
    override val totalCost: Int
        get() = selfPrice + transmission.totalCost

    enum class Type { PETROL, DIESEL, HYBRID, ELECTRIC }
}