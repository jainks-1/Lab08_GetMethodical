public class CtoFTableDisplay {
    public static void main(String[] args) {

        //  table header
        System.out.println("Celsius\t\tFahrenheit");

        // loop to print Celsius values with corresponding Fahrenheit values
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Convert C to F using method and print
            System.out.printf("%d\t\t%.2f\n", celsius, CtoF(celsius));
        }
    }

    // Celsius to Fahrenheit
    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}