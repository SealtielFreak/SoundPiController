package mx.ceti.soundpicontroller.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

import mx.ceti.soundpicontroller.R
import mx.ceti.soundpicontroller.StateEffect
import mx.ceti.soundpicontroller.effects.DelayEffect
import mx.ceti.soundpicontroller.effects.EchoEffect
import mx.ceti.soundpicontroller.effects.FuzzEffect
import mx.ceti.soundpicontroller.effects.ReverbEffect
import mx.ceti.soundpicontroller.effects.VibratoEffect
import mx.ceti.soundpicontroller.effects.OverdriveEffect
import mx.ceti.soundpicontroller.effects.BoosterEffect
import mx.ceti.soundpicontroller.effects.EffectState
import mx.ceti.soundpicontroller.effects.TremoloEffect


private val ALL_EFFECTS = mapOf(
    R.string.tab_text_0 to EchoEffect(),
    R.string.tab_text_1 to DelayEffect(),
    R.string.tab_text_2 to ReverbEffect(),
    R.string.tab_text_3 to VibratoEffect(),
    R.string.tab_text_4 to FuzzEffect(),
    R.string.tab_text_5 to OverdriveEffect(),
    R.string.tab_text_6 to BoosterEffect(),
    R.string.tab_text_7 to TremoloEffect(),
)

fun getKeyFromMapEffects(position: Int): Int = ALL_EFFECTS.keys.toTypedArray().get(position)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        val effect = ALL_EFFECTS[getKeyFromMapEffects(position)]
        return effect as Fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.getString(getKeyFromMapEffects(position))
    }

    override fun getCount(): Int {
        return ALL_EFFECTS.size
    }
}