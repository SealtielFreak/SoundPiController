package mx.ceti.soundpicontroller.effects

interface EffectState {
    var isActive: Boolean
        get() = false
        set(value) {
            isActive = value
        }

    fun changeState() {

    }
}