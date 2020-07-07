package com.codingblocks.carpicker.vehicle.parts.engine

import com.codingblocks.carpicker.vehicle.parts.transmission.Transmission

class PetrolEngine(override val transmission: Transmission) : Engine {
    override val selfPrice = 100000
    override val type = Engine.Type.PETROL
}

class DieselEngine(override val transmission: Transmission) : Engine {
    override val selfPrice = 200000
    override val type = Engine.Type.DIESEL
}

class ElectricEngine(override val transmission: Transmission) : Engine {
    override val selfPrice = 400000
    override val type = Engine.Type.ELECTRIC
}

class HybridEngine(override val transmission: Transmission) : Engine {
    override val selfPrice = 500000
    override val type = Engine.Type.HYBRID
}