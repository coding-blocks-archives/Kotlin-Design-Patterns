package com.codingblocks.carpicker

import com.codingblocks.carpicker.vehicle.Vehicle
import com.codingblocks.carpicker.vehicle.parts.*
import com.github.ajalt.clikt.core.UsageError
import com.github.ajalt.clikt.output.TermUi

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println(
                """
            | ------- Welcome to Car Picker 1.0 ---------
            | Here you can build your very own car, with 
            | with everthing fully customisable. Feel free
            | to pick engine, seats, wheels etc.
            """.trimMargin()
            )

            if (TermUi.confirm("Continue to build car ?") != true) {
                return
            }

            val wheelBaseSize: WheelBase.Size = TermUi.prompt(
                "Enter wheelbase size: (S)mall, (M)edium or (L)arge"
            ) {
                when (it) {
                    "S", "s" -> WheelBase.Size.SMALL
                    "M", "m" -> WheelBase.Size.MEDIUM
                    "L", "l" -> WheelBase.Size.LARGE
                    else -> throw UsageError("Size has to be S, M or L")
                }
            }!!

            val chasisBuilder = Chasis.Builder()

            TermUi.prompt(
                "Enter chasis type: (H)atchback, (S)edan, SU(V) or (P)ickup "
            ) {
                when (it) {
                    "H", "h" -> chasisBuilder.setChasisType(Chasis.Type.HATCHBACK)
                    "S", "s" -> chasisBuilder.setChasisType(Chasis.Type.SEDAN)
                    "V", "v" -> chasisBuilder.setChasisType(Chasis.Type.SUV)
                    "P", "p" -> chasisBuilder.setChasisType(Chasis.Type.PICKUP)
                    else -> throw UsageError("Size has to be S, M or L")
                }
            }!!

            chasisBuilder.setSeatFactory(Seat.Factory(Seat.Upholstery.REXINE))

            val myCar = Vehicle(
                WheelBase(
                    wheelBaseSize,
                    chasisBuilder.build(),
                    Wheel.Factory(Wheel.Type.ALLOY),
                    spareWheel = true
                ),
                Engine(
                    Engine.Type.PETROL,
                    Transmission(Transmission.Type.FWD)
                )
            )

            println("Ecosport = ₹${myCar.price}")
            println("Ecosport wheels = ${myCar.wheelBase.numWheels}")

        }
    }
}