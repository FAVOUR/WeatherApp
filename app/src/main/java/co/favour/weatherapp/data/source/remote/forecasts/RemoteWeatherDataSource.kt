package co.favour.weatherapp.data.source.remote.forecasts

import co.favour.weatherapp.data.source.remote.forecasts.response.WeatherResponse
import retrofit2.Response

interface RemoteWeatherDataSource {
    suspend fun fetchWeatherData(queryParam: Map<String, String>): Response<WeatherResponse>
}