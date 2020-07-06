package com.codingblocks.carpicker.vehicle.parts.transmission


class ManualTransmission private constructor(
    override val driveType: Transmission.DriveType
) : Transmission {

    override val shiftType = Transmission.ShiftType.MANUAL

    override val selfPrice: Int
        get() = when (this.driveType) {
            Transmission.DriveType.RWD -> 70000
            Transmission.DriveType.FWD -> 55000
            Transmission.DriveType.AWD -> 80000
        }

    class Factory : Transmission.Factory {
        override fun createTransmission(driveType: Transmission.DriveType) =
            ManualTransmission(driveType)
    }
}