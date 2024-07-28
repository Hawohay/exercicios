public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    double fahrenheit;
    double celsius;

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f Celsius equivalem a %.1f Fahrenheit%n", celsius, fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f Fahrenheit equivalem a %.1f Celsius%n", fahrenheit, celsius);
    }
}
