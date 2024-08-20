package B_Weather_Observer.built_in;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void Display() {
        System.out.println("Showing Weather for CurrentConditionDisplay \n Temperature: " + this.temperature + "\n Humidity: " + this.humidity + "\n Pressure: " + this.pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.Display();
        }

    }
}
