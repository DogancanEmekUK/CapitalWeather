package com.dogancanemek.capitalweather.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dogancanemek.capitalweather.R
import com.dogancanemek.capitalweather.model.WeatherModel

class WeatherAdapter(private val weatherData: WeatherModel) :
    RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {

    class WeatherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val region: TextView = view.findViewById(R.id.region)
        val country: TextView = view.findViewById(R.id.country)
        val lat: TextView = view.findViewById(R.id.lat)
        val lon: TextView = view.findViewById(R.id.lon)
        val tzId: TextView = view.findViewById(R.id.tz_id)
        val localTime: TextView = view.findViewById(R.id.localtime)
        val lastUpdated: TextView = view.findViewById(R.id.last_updated)
        val tempC: TextView = view.findViewById(R.id.temp_c)
        val tempF: TextView = view.findViewById(R.id.temp_f)
        val text: TextView = view.findViewById(R.id.text)
        val icon: ImageView = view.findViewById(R.id.icon)
        val windMph: TextView = view.findViewById(R.id.wind_mph)
        val windKph: TextView = view.findViewById(R.id.wind_kph)
        val windDegree: TextView = view.findViewById(R.id.wind_degree)
        val pressureMb: TextView = view.findViewById(R.id.pressure_mb)
        val pressureIn: TextView = view.findViewById(R.id.pressure_in)
        val humidity: TextView = view.findViewById(R.id.humidity)
        val cloud: TextView = view.findViewById(R.id.cloud)
        val feelsLikeC: TextView = view.findViewById(R.id.feelslike_c)
        val feelsLikeF: TextView = view.findViewById(R.id.feelslike_f)
        val visKm: TextView = view.findViewById(R.id.vis_km)
        val visMiles: TextView = view.findViewById(R.id.vis_miles)
        val uv: TextView = view.findViewById(R.id.uv)
        val precipitationMm: TextView = view.findViewById(R.id.precip_mm)
        val precipitationIn: TextView = view.findViewById(R.id.precip_in)
        val gustMph: TextView = view.findViewById(R.id.gust_mph)
        val gustKph: TextView = view.findViewById(R.id.gust_kph)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return WeatherViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.name.text = "City: ${weatherData.location.name}"
        holder.region.text = "Region: ${weatherData.location.region}"
        holder.country.text = "Country: ${weatherData.location.country}"
        holder.lat.text = "Latitude: ${weatherData.location.lat}"
        holder.lon.text = "Longitude: ${weatherData.location.lon}"
        holder.tzId.text = "Time Zone: ${weatherData.location.tz_id}"
        holder.localTime.text = "Local Time: ${weatherData.location.localtime}"
        holder.lastUpdated.text = "Last Updated: ${weatherData.current.last_updated}"
        holder.tempC.text = "${weatherData.current.temp_c.toInt()}C°"
        holder.tempF.text = "Fahrenheit: ${weatherData.current.temp_f}F°"
        holder.text.text = weatherData.current.condition.text
        holder.windMph.text = "Wind MPH: ${weatherData.current.wind_mph}"
        holder.windKph.text = "Wind KPH:${weatherData.current.wind_kph}"
        holder.windDegree.text = "Wind Degree: ${weatherData.current.wind_degree}°"
        holder.pressureMb.text = "Pressure in MB: ${weatherData.current.pressure_mb}"
        holder.pressureIn.text = "Pressure in IN: ${weatherData.current.pressure_in}"
        holder.precipitationMm.text =
            "Precipitation in MM: ${weatherData.current.precip_mm}"
        holder.precipitationIn.text = "Precipitation in IN: ${weatherData.current.precip_in}"
        holder.humidity.text = "Humidity: ${weatherData.current.humidity}%"
        holder.cloud.text = "Cloud: ${weatherData.current.cloud}%"
        holder.feelsLikeC.text = "Feels Like: ${weatherData.current.feelslike_c}C°"
        holder.feelsLikeF.text = "Feels Like: ${weatherData.current.feelslike_f}F°"
        holder.visMiles.text = "Vision in Miles: ${weatherData.current.vis_miles}"
        holder.visKm.text = "Vision in KM: ${weatherData.current.vis_km}"
        holder.uv.text = "UV Index: ${weatherData.current.uv}"
        holder.gustMph.text = "Gust MPH: ${weatherData.current.gust_mph}"
        holder.gustKph.text = "Gust KPH: ${weatherData.current.gust_kph}"
        Glide.with(holder.icon.context)
            .load("https:${weatherData.current.condition.icon}")
            .into(holder.icon)
    }

    override fun getItemCount(): Int {
        return 1
    }

}
