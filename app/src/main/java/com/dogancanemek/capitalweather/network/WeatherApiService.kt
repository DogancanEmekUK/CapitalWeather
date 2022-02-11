package com.dogancanemek.capitalweather.network

import com.dogancanemek.capitalweather.model.WeatherModel
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

object WeatherApi {
    val retrofitService: WeatherApiService by lazy {
        retrofit.create(WeatherApiService::class.java)
    }
}

private const val BASE_URL = "https://api.weatherapi.com/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface WeatherApiService {
    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=London&aqi=no")
    suspend fun getWeatherLondon(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Paris&aqi=no")
    suspend fun getWeatherParis(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Berlin&aqi=no")
    suspend fun getWeatherBerlin(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Madrid&aqi=no")
    suspend fun getWeatherMadrid(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Rome&aqi=no")
    suspend fun getWeatherRome(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Amsterdam&aqi=no")
    suspend fun getWeatherAmsterdam(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Brussels&aqi=no")
    suspend fun getWeatherBrussels(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Oslo&aqi=no")
    suspend fun getWeatherOslo(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Stockholm&aqi=no")
    suspend fun getWeatherStockholm(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Athens&aqi=no")
    suspend fun getWeatherAthens(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Sofia&aqi=no")
    suspend fun getWeatherSofia(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Copenhagen&aqi=no")
    suspend fun getWeatherCopenhagen(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Andorra%20la%20vella&aqi=no")
    suspend fun getWeatherAndorraLaVella(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Ankara&aqi=no&")
    suspend fun getWeatherAnkara(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Belgrade&aqi=no")
    suspend fun getWeatherBelgrade(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Bern&aqi=no")
    suspend fun getWeatherBern(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Bratislava&aqi=no")
    suspend fun getWeatherBratislava(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Bucharest&aqi=no")
    suspend fun getWeatherBucharest(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Budapest&aqi=no")
    suspend fun getWeatherBudapest(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Chisinau&aqi=no")
    suspend fun getWeatherChisinau(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Dublin&aqi=no")
    suspend fun getWeatherDublin(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Helsinki&aqi=no")
    suspend fun getWeatherHelsinki(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Kiev&aqi=no")
    suspend fun getWeatherKiev(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Lisbon&aqi=no")
    suspend fun getWeatherLisbon(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Ljubljana&aqi=no")
    suspend fun getWeatherLjubljana(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Luxembourg&aqi=no")
    suspend fun getWeatherLuxembourg(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Minsk&aqi=no")
    suspend fun getWeatherMinsk(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Monaco&aqi=no")
    suspend fun getWeatherMonaco(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Moscow&aqi=no")
    suspend fun getWeatherMoscow(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Podgorica&aqi=no")
    suspend fun getWeatherPodgorica(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Prague&aqi=no")
    suspend fun getWeatherPrague(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Reykjavik&aqi=no")
    suspend fun getWeatherReykjavik(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Riga&aqi=no")
    suspend fun getWeatherRiga(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=San%20Marino&aqi=no")
    suspend fun getWeatherSanMarino(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Sarajevo&aqi=no")
    suspend fun getWeatherSarajevo(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Skopje&aqi=no")
    suspend fun getWeatherSkopje(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Tallinn&aqi=no")
    suspend fun getWeatherTallinn(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Tirana&aqi=no")
    suspend fun getWeatherTirana(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Vaduz&aqi=no")
    suspend fun getWeatherVaduz(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Valletta&aqi=no")
    suspend fun getWeatherValletta(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Vatican%20City&aqi=no")
    suspend fun getWeatherVaticanCity(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Vienna&aqi=no")
    suspend fun getWeatherVienna(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Vilnius&aqi=no")
    suspend fun getWeatherVilnius(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Warsaw&aqi=no")
    suspend fun getWeatherWarsaw(): WeatherModel

    @GET("v1/current.json?key=4dfcf5369ad94ec4b1f204750211712&q=Zagreb&aqi=no")
    suspend fun getWeatherZagreb(): WeatherModel


}