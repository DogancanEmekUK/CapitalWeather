package com.dogancanemek.capitalweather.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dogancanemek.capitalweather.R
import com.dogancanemek.capitalweather.constants.Constants.AMSTERDAM
import com.dogancanemek.capitalweather.constants.Constants.ANDORRA_LA_VELLA
import com.dogancanemek.capitalweather.constants.Constants.ANKARA
import com.dogancanemek.capitalweather.constants.Constants.ATHENS
import com.dogancanemek.capitalweather.constants.Constants.BELGRADE
import com.dogancanemek.capitalweather.constants.Constants.BERLIN
import com.dogancanemek.capitalweather.constants.Constants.BERN
import com.dogancanemek.capitalweather.constants.Constants.BRATISLAVA
import com.dogancanemek.capitalweather.constants.Constants.BRUSSELS
import com.dogancanemek.capitalweather.constants.Constants.BUCHAREST
import com.dogancanemek.capitalweather.constants.Constants.BUDAPEST
import com.dogancanemek.capitalweather.constants.Constants.CHISINAU
import com.dogancanemek.capitalweather.constants.Constants.COPENHAGEN
import com.dogancanemek.capitalweather.constants.Constants.DUBLIN
import com.dogancanemek.capitalweather.constants.Constants.HELSINKI
import com.dogancanemek.capitalweather.constants.Constants.KEY_PAGE
import com.dogancanemek.capitalweather.constants.Constants.KIEV
import com.dogancanemek.capitalweather.constants.Constants.LISBON
import com.dogancanemek.capitalweather.constants.Constants.LJUBLJANA
import com.dogancanemek.capitalweather.constants.Constants.LONDON
import com.dogancanemek.capitalweather.constants.Constants.LUXEMBOURG
import com.dogancanemek.capitalweather.constants.Constants.MADRID
import com.dogancanemek.capitalweather.constants.Constants.MINSK
import com.dogancanemek.capitalweather.constants.Constants.MONACO
import com.dogancanemek.capitalweather.constants.Constants.MOSCOW
import com.dogancanemek.capitalweather.constants.Constants.OSLO
import com.dogancanemek.capitalweather.constants.Constants.PARIS
import com.dogancanemek.capitalweather.constants.Constants.PODGORICA
import com.dogancanemek.capitalweather.constants.Constants.PRAGUE
import com.dogancanemek.capitalweather.constants.Constants.REYKJAVIK
import com.dogancanemek.capitalweather.constants.Constants.RIGA
import com.dogancanemek.capitalweather.constants.Constants.ROME
import com.dogancanemek.capitalweather.constants.Constants.SAN_MARINO
import com.dogancanemek.capitalweather.constants.Constants.SARAJEVO
import com.dogancanemek.capitalweather.constants.Constants.SKOPJE
import com.dogancanemek.capitalweather.constants.Constants.SOFIA
import com.dogancanemek.capitalweather.constants.Constants.STOCKHOLM
import com.dogancanemek.capitalweather.constants.Constants.TALLINN
import com.dogancanemek.capitalweather.constants.Constants.TIRANA
import com.dogancanemek.capitalweather.constants.Constants.VADUZ
import com.dogancanemek.capitalweather.constants.Constants.VALLETTA
import com.dogancanemek.capitalweather.constants.Constants.VATICAN_CITY
import com.dogancanemek.capitalweather.constants.Constants.VIENNA
import com.dogancanemek.capitalweather.constants.Constants.VILNIUS
import com.dogancanemek.capitalweather.constants.Constants.WARSAW
import com.dogancanemek.capitalweather.constants.Constants.ZAGREB
import com.dogancanemek.capitalweather.databinding.FragmentCityBinding

class CityFragment : Fragment() {
    private var binding: FragmentCityBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentCityBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.cityFragment = this
        initListeners()
    }

    private fun initListeners() {
        binding?.apply {
            london.setOnClickListener { seeWeather(LONDON) }
            paris.setOnClickListener { seeWeather(PARIS) }
            berlin.setOnClickListener { seeWeather(BERLIN) }
            madrid.setOnClickListener { seeWeather(MADRID) }
            rome.setOnClickListener { seeWeather(ROME) }
            copenhagen.setOnClickListener { seeWeather(COPENHAGEN) }
            oslo.setOnClickListener { seeWeather(OSLO) }
            sofia.setOnClickListener { seeWeather(SOFIA) }
            amsterdam.setOnClickListener { seeWeather(AMSTERDAM) }
            athens.setOnClickListener { seeWeather(ATHENS) }
            brussels.setOnClickListener { seeWeather(BRUSSELS) }
            andorraLaVella.setOnClickListener { seeWeather(ANDORRA_LA_VELLA) }
            belgrade.setOnClickListener { seeWeather(BELGRADE) }
            bern.setOnClickListener { seeWeather(BERN) }
            bratislava.setOnClickListener { seeWeather(BRATISLAVA) }
            bucharest.setOnClickListener { seeWeather(BUCHAREST) }
            budapest.setOnClickListener { seeWeather(BUDAPEST) }
            chisinau.setOnClickListener { seeWeather(CHISINAU) }
            dublin.setOnClickListener { seeWeather(DUBLIN) }
            helsinki.setOnClickListener { seeWeather(HELSINKI) }
            ljubljana.setOnClickListener { seeWeather(LJUBLJANA) }
            kiev.setOnClickListener { seeWeather(KIEV) }
            lisbon.setOnClickListener { seeWeather(LISBON) }
            monaco.setOnClickListener { seeWeather(MONACO) }
            minsk.setOnClickListener { seeWeather(MINSK) }
            moscow.setOnClickListener { seeWeather(MOSCOW) }
            podgorica.setOnClickListener { seeWeather(PODGORICA) }
            prague.setOnClickListener { seeWeather(PRAGUE) }
            reykjavik.setOnClickListener { seeWeather(REYKJAVIK) }
            skopje.setOnClickListener { seeWeather(SKOPJE) }
            sarajevo.setOnClickListener { seeWeather(SARAJEVO) }
            riga.setOnClickListener { seeWeather(RIGA) }
            stockholm.setOnClickListener { seeWeather(STOCKHOLM) }
            sanMarino.setOnClickListener { seeWeather(SAN_MARINO) }
            tallinn.setOnClickListener { seeWeather(TALLINN) }
            tirana.setOnClickListener { seeWeather(TIRANA) }
            vaduz.setOnClickListener { seeWeather(VADUZ) }
            valletta.setOnClickListener { seeWeather(VALLETTA) }
            vaticanCity.setOnClickListener { seeWeather(VATICAN_CITY) }
            vienna.setOnClickListener { seeWeather(VIENNA) }
            vilnius.setOnClickListener { seeWeather(VILNIUS) }
            warsaw.setOnClickListener { seeWeather(WARSAW) }
            zagreb.setOnClickListener { seeWeather(ZAGREB) }
            luxembourg.setOnClickListener { seeWeather(LUXEMBOURG) }
            ankara.setOnClickListener { seeWeather(ANKARA) }
        }
    }

    private fun seeWeather(pageKey: String) {
        findNavController().navigate(
            R.id.action_cityFragment_to_weatherFragment,
            bundleOf(KEY_PAGE to pageKey)
        )
    }

}