package com.codingblocks.carpicker.vehicle.parts.transmission

import com.codingblocks.carpicker.vehicle.parts.Part

class Transmission(val type: Type) :
    Part {
    override val selfPrice: Int
        get() = when (this.type) {
            Type.RWD -> 90000
            Type.FWD -> 75000
            Type.AWD -> 110000
        }

    override val totalCost = selfPrice

    enum class Type { RWD, FWD, AWD }
}