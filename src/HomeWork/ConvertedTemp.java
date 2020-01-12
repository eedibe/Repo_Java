package HomeWork;

public class ConvertedTemp {

    public static double getCelsius2Fahrenheit(double celsius) {
        //convert celsius to fahrenheit
        // formula:T(°F) = T(°C) × 9/5 + 32
        double fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }
    public static double getCelsius2Kelvin(double celsius) {
        //convert  celsius values to kelvin
        // formula: T(K) = 20°C + 273.15 = 293.15 K
        double kelvin = (celsius + 273.15);
        return kelvin;
    }

    public static double getKelvin2Celsius(double kelvin) {
        //Convert Kelvin temperature to celsius
        //T(°C) = T(K) - 273.15
        double celsius = kelvin - 273.15;
        return celsius;
    }
    public static double getKelvinto2Fahrenheit(double kelvin) {
        //Convert Kelvin temperature to fahrenheit
        //T(°F) = T(K) × 9/5 - 459.67
        double fahrenheit = kelvin * 9/5 - 459.67;
        return fahrenheit;
    }
}
