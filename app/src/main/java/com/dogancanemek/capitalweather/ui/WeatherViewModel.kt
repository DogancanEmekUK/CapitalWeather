package com.dogancanemek.capitalweather.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dogancanemek.capitalweather.model.WeatherModel
import com.dogancanemek.capitalweather.network.WeatherApi
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val _weather = MutableLiveData<WeatherModel>()
    val weather: LiveData<WeatherModel> = _weather

    val pageName = MutableLiveData<String>()

    fun getLondonWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherLondon()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getParisWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherParis()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBerlinWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBerlin()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getMadridWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherMadrid()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getRomeWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherRome()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getAmsterdamWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherAmsterdam()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBrusselsWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBrussels()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getStockholmWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherStockholm()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getOsloWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherOslo()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getAthensWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherAthens()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getSofiaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherSofia()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getCopenhagenWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherCopenhagen()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getAndorraLaVellaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherAndorraLaVella()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getAnkaraWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherAnkara()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBelgradeWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBelgrade()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBernWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBern()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBratislavaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBratislava()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBucharestWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBucharest()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getBudapestWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherBudapest()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getChisinauWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherChisinau()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getDublinWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherDublin()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getHelsinkiWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherHelsinki()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getKievWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherKiev()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getLisbonWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherLisbon()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getLjubljanaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherLjubljana()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getMinskWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherMinsk()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getMoscowWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherMoscow()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getLuxembourgWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherLuxembourg()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getMonacoWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherMonaco()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getPodgoricaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherPodgorica()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getPragueWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherPrague()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getReykjavikWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherReykjavik()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getRigaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherRiga()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getSanMarinoWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherSanMarino()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getSarajevoWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherSarajevo()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getSkopjeWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherSkopje()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getTallinnWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherTallinn()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getTiranaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherTirana()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getVaduzWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherVaduz()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getVallettaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherValletta()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getVaticanCityWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherVaticanCity()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getViennaWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherVienna()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getVilniusWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherVilnius()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getWarsawWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherWarsaw()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

    fun getZagrebWeather() {
        viewModelScope.launch {
            try {
                _weather.value = WeatherApi.retrofitService.getWeatherZagreb()
            } catch (e: Exception) {
                Log.e(this.javaClass.simpleName, e.localizedMessage, e)
            }
        }
    }

}
