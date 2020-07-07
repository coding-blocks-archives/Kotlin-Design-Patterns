package com.codingblocks.carpicker.vehicle.parts.transmission

class AutomaticTransmission private constructor(
    override val driveType: Transmission.DriveType
) : Transmission {

    override val shiftType = Transmission.ShiftType.AUTOMATIC

    override val selfPrice: Int
        get() = when (this.driveType) {
            Transmission.DriveType.RWD -> 90000
            Transmission.DriveType.FWD -> 75000
            Transmission.DriveType.AWD -> 110000
        }

    class Factory : Transmission.Factory {
        override fun createTransmission(driveType: Transmission.DriveType) =
            AutomaticTransmission(driveType)

    }
}