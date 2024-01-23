package mx.ceti.soundpicontroller.communication

class Bluetooth private constructor() {
    companion object {
        val instance: Bluetooth by lazy {
            Bluetooth()
        }
    }

    init {

    }
}