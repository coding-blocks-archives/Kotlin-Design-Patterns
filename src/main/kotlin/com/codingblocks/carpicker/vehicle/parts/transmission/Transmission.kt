package com.codingblocks.carpicker.vehicle.parts.transmission

import com.codingblocks.carpicker.vehicle.parts.Part

interface Transmission : Part {

    val driveType: DriveType
    val shiftType: ShiftType

    override val totalCost get() = selfPrice

    enum class DriveType { RWD, FWD, AWD }
    enum class ShiftType { MANUAL, AUTOMATIC }

    /**
     * Abstract factory interface to create transmissions.
     * All classes that extend [Transmission] should have their
     * own factories.
     */
    interface Factory {
        fun createTransmission(driveType: DriveType): Transmission

        companion object {
            fun automaticTransmissionFactory() = AutomaticTransmission.Factory()
            fun manualTransmissionFactory() = ManualTransmission.Factory()
        }
    }



}