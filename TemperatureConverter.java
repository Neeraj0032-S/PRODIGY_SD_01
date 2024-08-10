import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the unit of the temperature (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        double celsius = 0.0, fahrenheit = 0.0, kelvin = 0.0;

    
        switch (unit) {
            case 'C':
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case 'F':
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case 'K':
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
                System.out.println("Invalid unit entered. Please enter C, F, or K.");
                System.exit(0);
        }

        // Display the converted values
        System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2fK%n", kelvin);

        scanner.close();
    }

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
