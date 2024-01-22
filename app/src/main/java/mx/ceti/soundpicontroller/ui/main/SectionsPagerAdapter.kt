package mx.ceti.soundpicontroller.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import mx.ceti.soundpicontroller.DelayEffect
import mx.ceti.soundpicontroller.FuzzEffect
import mx.ceti.soundpicontroller.R
import mx.ceti.soundpicontroller.ReverbEffect
import mx.ceti.soundpicontroller.VibratoEffect


private val MAP_EFFECT = mapOf<Int, Fragment>(
    R.string.tab_text_1 to (DelayEffect as Fragment),
    R.string.tab_text_2 to (ReverbEffect as Fragment),
    R.string.tab_text_3 to (VibratoEffect as Fragment),
    R.string.tab_text_4 to (FuzzEffect as Fragment),
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> DelayEffect.newInstance("", "")
            1 -> ReverbEffect.newInstance("", "")
            2 -> VibratoEffect.newInstance("", "")
            3 -> FuzzEffect.newInstance("", "")
            else -> DelayEffect.newInstance("", "")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Delay"
            1 -> "Reverb"
            2 -> "Vibrato"
            3 -> "Fuzz"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 4
    }
}