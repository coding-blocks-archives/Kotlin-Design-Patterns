package com.codingblocks.carpicker

import com.codingblocks.carpicker.vehicle.Vehicle

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World")

            val v = Vehicle()
            println("My car's price is = ${v.price}")

        }
    }
}