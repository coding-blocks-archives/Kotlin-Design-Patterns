package com.codingblocks.carpicker.vehicle.parts.chassis

import com.codingblocks.carpicker.vehicle.parts.seat.Seat

/*
 * Honestly, in English, 'chassis' is the plural of 'chassis',
 * but we needed a file with a different name, so...
 */

class HatchbackChassis(override val seats: List<Seat>) : Chassis {
    override val type = Chassis.Type.HATCHBACK
    override val selfPrice = 150000
}

class SedanChassis(override val seats: List<Seat>) : Chassis {
    override val type = Chassis.Type.SEDAN
    override val selfPrice = 200000
}

class SuvChassis(override val seats: List<Seat>) : Chassis {
    override val type = Chassis.Type.SUV
    override val selfPrice = 250000
}

class PickupChassis(override val seats: List<Seat>) : Chassis {
    override val type = Chassis.Type.PICKUP
    override val selfPrice = 350000
}