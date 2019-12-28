package HomeWork;

public class TempCal {

    public static void main(String[] args) {

        double celsius = 35;

        //convert  celsius values to kelvin
        // formula: T(K) = 20°C + 273.15 = 293.15 K
        double kelvin = (celsius + 273.15);
        System.out.println(celsius + "°C" + " = " + kelvin + "K");

        //convert  celsius values to fahrenheit
        // formula: T(°F) = T(°C) × 9/5 + 32

        double fahrenheit = (celsius * 9/5 + 32);
        System.out.println(celsius +"°C"  + " = " + fahrenheit + "F");

        double kelvinTemp = 300;
        //convert kelvin to celsius
        //T(°C) = T(K) - 273.15
        double celsiusTemp = kelvinTemp - 273.15;
        System.out.println(kelvinTemp + "K" + " = " + celsiusTemp + "°C");

        //convert kelvin to fahrenheit
        //T(°F) = T(K) × 9/5 - 459.67
        double fahrenheitTemp = kelvinTemp * 9/5 - 459.67;
        System.out.println(kelvinTemp + "K" + " = " + fahrenheitTemp + "F");
    }
}
