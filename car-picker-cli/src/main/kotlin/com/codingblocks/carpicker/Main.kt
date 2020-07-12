package com.codingblocks.carpicker

import com.codingblocks.carpicker.cli.App
import com.codingblocks.carpicker.di.components.DaggerCarPicker
import com.codingblocks.carpicker.vehicle.vehicles.FordF150
import com.codingblocks.carpicker.vehicle.vehicles.FordF150_Factory
import com.github.ajalt.clikt.output.TermUi

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()

            println(app.welcomeString)

            if (TermUi.confirm("Continue to build car ?") != true) {
                return
            }

            app.prepareWheelBaseBuilder()
            app.prepareChassisBuilder()
            app.prepareEngineBuilder()

            DaggerCarPicker.create()

            val myCar = app.buildVehicle()

            println("Ecosport = ₹${myCar.price}")
            println("Ecosport wheels = ${myCar.wheelBase.wheels.size}")

        }
    }
}