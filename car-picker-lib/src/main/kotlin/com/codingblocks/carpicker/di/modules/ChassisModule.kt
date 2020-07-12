package com.codingblocks.carpicker.di.modules

import com.codingblocks.carpicker.vehicle.parts.chassis.PickupChassis
import com.codingblocks.carpicker.vehicle.parts.seat.Seat
import dagger.Module
import dagger.Provides

@Module
class ChassisModule {

    @Provides
    fun proviedePickupChassis(): PickupChassis {
        return PickupChassis(Seat.Factory(Seat.Upholstery.LEATHER).createSeats(6))
    }
}