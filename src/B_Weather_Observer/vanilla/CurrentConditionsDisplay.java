package B_Weather_Observer.vanilla;

import B_Weather_Observer.vanilla.core.DisplayElement;
import B_Weather_Observer.vanilla.core.Observer;
import B_Weather_Observer.vanilla.core.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void Display() {
        System.out.println("Showing Weather for CurrentConditionDisplay \n Temperature: " + this.temperature + "\n Humidity: " + this.humidity + "\n Pressure: " + this.pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.Display();
    }
}
