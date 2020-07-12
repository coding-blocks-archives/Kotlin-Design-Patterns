package com.codingblocks.carpicker.vehicle.vehicles

import com.codingblocks.carpicker.vehicle.Vehicle
import com.codingblocks.carpicker.vehicle.parts.chassis.Chassis
import com.codingblocks.carpicker.vehicle.parts.chassis.PickupChassis
import com.codingblocks.carpicker.vehicle.parts.engine.DieselEngine
import com.codingblocks.carpicker.vehicle.parts.engine.Engine
import com.codingblocks.carpicker.vehicle.parts.wheelbase.LargeWheelBase
import com.codingblocks.carpicker.vehicle.parts.wheelbase.WheelBase
import javax.inject.Inject

class FordF150 @Inject internal constructor(
        largeWheelBase: LargeWheelBase,
        pickupChassis: PickupChassis,
        dieselEngine: DieselEngine
) : Vehicle {
    override var wheelBase: WheelBase = largeWheelBase
    override var chassis: Chassis = pickupChassis
    override var engine: Engine = dieselEngine

}