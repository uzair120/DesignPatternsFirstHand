package B_Weather_Observer;

import B_Weather_Observer.vanilla.CurrentConditionsDisplay;
import B_Weather_Observer.vanilla.ForecastDisplay;
import B_Weather_Observer.vanilla.WeatherData;

public class MainWeatherVanilla {
    public static void execute() {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setWeatherData(80L, 90L, 100L);
        weatherData.setWeatherData(20L, 30L, 40L);
    }
}
