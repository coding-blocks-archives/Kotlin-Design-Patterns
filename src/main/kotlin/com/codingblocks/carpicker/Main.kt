package com.codingblocks.carpicker

import com.codingblocks.carpicker.cli.App
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
            app.prepareChasisBuilder()
            app.prepareEngineBuilder()

            val myCar = app.buildVehicle()

            println("Ecosport = ₹${myCar.price}")
            println("Ecosport wheels = ${myCar.wheelBase.wheels.size}")

        }
    }
}