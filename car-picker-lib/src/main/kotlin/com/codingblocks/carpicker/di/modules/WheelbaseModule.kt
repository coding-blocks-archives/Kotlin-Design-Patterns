package com.codingblocks.carpicker.di.modules

import com.codingblocks.carpicker.vehicle.parts.wheel.Wheel
import com.codingblocks.carpicker.vehicle.parts.wheelbase.LargeWheelBase
import dagger.Module
import dagger.Provides

@Module
class WheelbaseModule {

    @Provides
    fun providesLargeWheelbase(): LargeWheelBase {
        return LargeWheelBase(Wheel.Factory.alloyWheelFactory().createWheels())
    }
}