package com.codingblocks.carpicker

import com.codingblocks.carpicker.vehicle.Vehicle
import com.codingblocks.carpicker.vehicle.parts.Chasis
import com.codingblocks.carpicker.vehicle.parts.Engine
import com.codingblocks.carpicker.vehicle.parts.Transmission
import com.codingblocks.carpicker.vehicle.parts.WheelBase

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")

            val hondaCity = Vehicle(
                WheelBase(
                    WheelBase.Size.MEDIUM,
                    Chasis(Chasis.Type.SEDAN)
                ),
                Engine(
                    Engine.Type.DIESEL,
                    Transmission(Transmission.Type.AWD)
                )
            )

            val ecosport = Vehicle(
                WheelBase(
                    WheelBase.Size.SMALL,
                    Chasis(Chasis.Type.SUV)
                ),
                Engine(
                    Engine.Type.PETROL,
                    Transmission(Transmission.Type.FWD)
                )
            )

            println("HondaCity = ₹${hondaCity.price}")
            println("Ecosport = ₹${ecosport.price}")

        }
    }
}