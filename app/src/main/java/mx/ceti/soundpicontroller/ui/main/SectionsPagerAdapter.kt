package mx.ceti.soundpicontroller.ui.main

import android.content.Context
import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import mx.ceti.soundpicontroller.ActivityTabs
import mx.ceti.soundpicontroller.R
import mx.ceti.soundpicontroller.DelayEffect
import mx.ceti.soundpicontroller.FuzzEffect
import mx.ceti.soundpicontroller.ReverbEffect
import mx.ceti.soundpicontroller.VibratoEffect


private val ALL_EFFECTS = mapOf(
    R.string.tab_text_1 to DelayEffect(),
    R.string.tab_text_2 to ReverbEffect(),
    R.string.tab_text_3 to VibratoEffect(),
    R.string.tab_text_4 to FuzzEffect(),
)

fun getKeyFromMapEffects(position: Int): Int = ALL_EFFECTS.keys.toTypedArray().get(position)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return ALL_EFFECTS[getKeyFromMapEffects(position)] as Fragment
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.getString(getKeyFromMapEffects(position))
    }

    override fun getCount(): Int {
        return ALL_EFFECTS.size
    }
}