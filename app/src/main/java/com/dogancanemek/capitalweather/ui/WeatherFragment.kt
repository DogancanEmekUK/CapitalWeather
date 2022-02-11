package com.dogancanemek.capitalweather.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dogancanemek.capitalweather.adapter.WeatherAdapter
import com.dogancanemek.capitalweather.constants.Constants.AMSTERDAM
import com.dogancanemek.capitalweather.constants.Constants.ATHENS
import com.dogancanemek.capitalweather.constants.Constants.BERLIN
import com.dogancanemek.capitalweather.constants.Constants.BRUSSELS
import com.dogancanemek.capitalweather.constants.Constants.COPENHAGEN
import com.dogancanemek.capitalweather.constants.Constants.KEY_PAGE
import com.dogancanemek.capitalweather.constants.Constants.LONDON
import com.dogancanemek.capitalweather.constants.Constants.MADRID
import com.dogancanemek.capitalweather.constants.Constants.OSLO
import com.dogancanemek.capitalweather.constants.Constants.PARIS
import com.dogancanemek.capitalweather.constants.Constants.ROME
import com.dogancanemek.capitalweather.constants.Constants.SOFIA
import com.dogancanemek.capitalweather.constants.Constants.STOCKHOLM
import com.dogancanemek.capitalweather.constants.Constants.ANDORRA_LA_VELLA
import com.dogancanemek.capitalweather.constants.Constants.ANKARA
import com.dogancanemek.capitalweather.constants.Constants.BELGRADE
import com.dogancanemek.capitalweather.constants.Constants.BERN
import com.dogancanemek.capitalweather.constants.Constants.BRATISLAVA
import com.dogancanemek.capitalweather.constants.Constants.BUCHAREST
import com.dogancanemek.capitalweather.constants.Constants.BUDAPEST
import com.dogancanemek.capitalweather.constants.Constants.CHISINAU
import com.dogancanemek.capitalweather.constants.Constants.DUBLIN
import com.dogancanemek.capitalweather.constants.Constants.HELSINKI
import com.dogancanemek.capitalweather.constants.Constants.KIEV
import com.dogancanemek.capitalweather.constants.Constants.LISBON
import com.dogancanemek.capitalweather.constants.Constants.LJUBLJANA
import com.dogancanemek.capitalweather.constants.Constants.LUXEMBOURG
import com.dogancanemek.capitalweather.constants.Constants.MINSK
import com.dogancanemek.capitalweather.constants.Constants.MONACO
import com.dogancanemek.capitalweather.constants.Constants.MOSCOW
import com.dogancanemek.capitalweather.constants.Constants.PODGORICA
import com.dogancanemek.capitalweather.constants.Constants.PRAGUE
import com.dogancanemek.capitalweather.constants.Constants.REYKJAVIK
import com.dogancanemek.capitalweather.constants.Constants.RIGA
import com.dogancanemek.capitalweather.constants.Constants.SAN_MARINO
import com.dogancanemek.capitalweather.constants.Constants.SARAJEVO
import com.dogancanemek.capitalweather.constants.Constants.SKOPJE
import com.dogancanemek.capitalweather.constants.Constants.TALLINN
import com.dogancanemek.capitalweather.constants.Constants.TIRANA
import com.dogancanemek.capitalweather.constants.Constants.VADUZ
import com.dogancanemek.capitalweather.constants.Constants.VALLETTA
import com.dogancanemek.capitalweather.constants.Constants.VATICAN_CITY
import com.dogancanemek.capitalweather.constants.Constants.VIENNA
import com.dogancanemek.capitalweather.constants.Constants.VILNIUS
import com.dogancanemek.capitalweather.constants.Constants.WARSAW
import com.dogancanemek.capitalweather.constants.Constants.ZAGREB
import com.dogancanemek.capitalweather.databinding.FragmentWeatherBinding
import com.dogancanemek.capitalweather.model.WeatherModel

class WeatherFragment : Fragment() {

    private val viewModel: WeatherViewModel by viewModels()
    private lateinit var binding: FragmentWeatherBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeatherBinding.inflate(inflater)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initObservers()
        getArgs()
    }

    private fun getArgs() {
        arguments?.getString(KEY_PAGE)?.let {
            viewModel.pageName.value = it
            Log.d("Weather", it)
        }
    }

    private fun initObservers() {
        viewModel.apply {
            weather.observe(viewLifecycleOwner) {
                initAdapter(it)
            }
            pageName.observe(viewLifecycleOwner) {
                getWeather()
            }
        }
    }

    private fun initAdapter(weather: WeatherModel) {
        val adapter = WeatherAdapter(weather)
        binding.weatherView.adapter = adapter
    }

    private fun getWeather() {
        viewModel.apply {
            when (pageName.value) {
                LONDON -> getLondonWeather()
                PARIS -> getParisWeather()
                BERLIN -> getBerlinWeather()
                MADRID -> getMadridWeather()
                ROME -> getRomeWeather()
                OSLO -> getOsloWeather()
                BRUSSELS -> getBrusselsWeather()
                COPENHAGEN -> getCopenhagenWeather()
                ATHENS -> getAthensWeather()
                SOFIA -> getSofiaWeather()
                STOCKHOLM -> getStockholmWeather()
                AMSTERDAM -> getAmsterdamWeather()
                ANDORRA_LA_VELLA -> getAndorraLaVellaWeather()
                BELGRADE -> getBelgradeWeather()
                BRATISLAVA -> getBratislavaWeather()
                BERN -> getBernWeather()
                BUCHAREST -> getBucharestWeather()
                BUDAPEST -> getBudapestWeather()
                CHISINAU -> getChisinauWeather()
                DUBLIN -> getDublinWeather()
                HELSINKI -> getHelsinkiWeather()
                KIEV -> getKievWeather()
                LISBON -> getLisbonWeather()
                LUXEMBOURG -> getLuxembourgWeather()
                LJUBLJANA -> getLjubljanaWeather()
                MONACO -> getMonacoWeather()
                MINSK -> getMinskWeather()
                MOSCOW -> getMoscowWeather()
                PODGORICA -> getPodgoricaWeather()
                PRAGUE -> getPragueWeather()
                REYKJAVIK -> getReykjavikWeather()
                RIGA -> getRigaWeather()
                SAN_MARINO -> getSanMarinoWeather()
                SARAJEVO -> getSarajevoWeather()
                SKOPJE -> getSkopjeWeather()
                TALLINN -> getTallinnWeather()
                TIRANA -> getTiranaWeather()
                VADUZ -> getVaduzWeather()
                VALLETTA -> getVallettaWeather()
                VATICAN_CITY -> getVaticanCityWeather()
                VIENNA -> getViennaWeather()
                VILNIUS -> getVilniusWeather()
                WARSAW -> getWarsawWeather()
                ZAGREB -> getZagrebWeather()
                ANKARA -> getAnkaraWeather()
            }
        }
    }
}