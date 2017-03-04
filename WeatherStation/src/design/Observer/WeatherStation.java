package design.Observer;

/**
 * Created by Administrator on 2017/3/4.
 */
public class WeatherStation {
    public static void main(String args0[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
