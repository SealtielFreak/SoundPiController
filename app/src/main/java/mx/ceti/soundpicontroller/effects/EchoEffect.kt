package mx.ceti.soundpicontroller.effects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

import com.google.android.material.slider.RangeSlider

import mx.ceti.soundpicontroller.R
import mx.ceti.soundpicontroller.communication.Bluetooth

class EchoEffect : Fragment(), EffectState {
    lateinit var sliderEcho: RangeSlider
    lateinit var valueEcho: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_echo_effect, container, false)

        val ble = Bluetooth.instance

        valueEcho = view.findViewById(R.id.value_echo)

        sliderEcho = view.findViewById(R.id.slider_echo)
        sliderEcho.addOnChangeListener { slider, value, fromUser ->
            valueEcho.text = "${value.toInt()}"
        }

        return view
    }
}