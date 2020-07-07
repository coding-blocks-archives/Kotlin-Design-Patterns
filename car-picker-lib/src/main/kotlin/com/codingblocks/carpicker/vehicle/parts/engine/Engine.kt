package com.codingblocks.carpicker.vehicle.parts.engine

import com.codingblocks.carpicker.vehicle.parts.Part
import com.codingblocks.carpicker.vehicle.parts.transmission.Transmission

interface Engine : Part {
    enum class Type { PETROL, DIESEL, HYBRID, ELECTRIC }

    val type: Type
    val transmission: Transmission

    override val totalCost: Int
        get() = selfPrice + transmission.totalCost


    class Builder {

        private lateinit var engineType: Type
        private lateinit var transmission: Transmission

        fun setEngineType(engineType: Type): Builder {
            this.engineType = engineType
            return this
        }

        fun setTransmission(transmission: Transmission): Builder {
            this.transmission = transmission
            return this
        }

        fun build(): Engine = when (this.engineType) {
            Type.PETROL -> PetrolEngine(this.transmission)
            Type.DIESEL -> DieselEngine(this.transmission)
            Type.HYBRID -> HybridEngine(this.transmission)
            Type.ELECTRIC -> ElectricEngine(this.transmission)
        }
    }
}