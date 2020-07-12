package com.codingblocks.carpicker.di.modules

import com.codingblocks.carpicker.vehicle.parts.engine.DieselEngine
import com.codingblocks.carpicker.vehicle.parts.transmission.Transmission
import dagger.Module
import dagger.Provides

@Module
class EngineModule {

    @Provides
    fun providesDieselEngine(): DieselEngine {
        return DieselEngine(
                Transmission.Factory.automaticTransmissionFactory()
                        .createTransmission(Transmission.DriveType.AWD)
        )
    }
}