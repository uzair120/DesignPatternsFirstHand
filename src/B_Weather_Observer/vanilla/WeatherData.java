package B_Weather_Observer.vanilla;

import B_Weather_Observer.vanilla.core.Observer;
import B_Weather_Observer.vanilla.core.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    ArrayList<Observer> arrayList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.arrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
//        if(!arrayList.contains(observer))
        arrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        arrayList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : arrayList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    void measurementsChanged() {
        this.notifyObservers();
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
