package br.com.fabiokreis.dogs.view

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import br.com.fabiokreis.dogs.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }

}
