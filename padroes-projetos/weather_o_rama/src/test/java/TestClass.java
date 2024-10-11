import com.br.padroesdeporjetos.weather_o_rama.refatorado_usando_api_do_jdk.CurrentConditionsDisplay;
import com.br.padroesdeporjetos.weather_o_rama.refatorado_usando_api_do_jdk.WeatherData;

public class TestClass {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
  }
}
