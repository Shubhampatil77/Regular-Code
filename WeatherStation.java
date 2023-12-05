
import java.util.Observable;
import java.util.Observer;
// WeatherData class represents the Weather Station
class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
  // Constructor
    public WeatherData() {
        // Initialize the WeatherData object
        this.temperature = 0.0f;
        this.humidity = 0.0f;
        this.pressure = 0.0f;
    }
    // Method to notify observers when measurements have changed
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
 // Method to set new measurements and trigger notification
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    // Getter methods for temperature, humidity, and pressure
    public float getTemperature() {
        return temperature;
    }
  public float getHumidity() {
        return humidity;
    }
public float getPressure() {
        return pressure;
    }
}

// Display class represents an observer that displays weather data
class Display implements Observer {
    private WeatherData weatherData;

    // Constructor
    public Display(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            float humidity = weatherData.getHumidity();
            float pressure = weatherData.getPressure();

            // Display the updated weather data
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Pressure: " + pressure + " hPa");
            System.out.println("---------------------------");
        }
    }
}

public class WeatherStation {
    public static void main(String[] args) {
        // Create a WeatherData object (Weather Station)
        WeatherData weatherData = new WeatherData();

        // Create two displays (observers) for weather data
        Display display1 = new Display(weatherData);
        Display display2 = new Display(weatherData);

        // Simulate updates to weather data
        weatherData.setMeasurements(25.5f, 65.0f, 1013.2f);
        weatherData.setMeasurements(28.0f, 70.5f, 1010.0f);
    }
}
