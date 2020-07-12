package com.codingblocks.carpicker.di.components

import com.codingblocks.carpicker.di.modules.ChassisModule
import com.codingblocks.carpicker.di.modules.EngineModule
import com.codingblocks.carpicker.di.modules.WheelbaseModule
import com.codingblocks.carpicker.vehicle.vehicles.FordF150
import dagger.Component

@Component(modules = [
    WheelbaseModule::class,
    ChassisModule::class,
    EngineModule::class
])
interface CarPicker {
    val fordF150: FordF150
}