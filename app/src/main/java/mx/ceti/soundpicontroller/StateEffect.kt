package mx.ceti.soundpicontroller

import android.widget.ToggleButton

class StateEffect(val state: ToggleButton){
    var active: Boolean = false
        get() = state.isActivated

        set(value) {
            field = value
            state.isActivated = field
        }

    companion object {
        lateinit var instance: StateEffect
            private set
    }

    init {

    }
}