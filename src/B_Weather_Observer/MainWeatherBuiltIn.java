package B_Weather_Observer;

import B_Weather_Observer.built_in.CurrentConditionsDisplay;
import B_Weather_Observer.built_in.ForecastDisplay;
import B_Weather_Observer.built_in.WeatherData;

public class MainWeatherBuiltIn {
    public static void execute() {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setWeatherData(60L, 70L, 80L);
        weatherData.setWeatherData(40L, 45L, 50L);
    }
}
