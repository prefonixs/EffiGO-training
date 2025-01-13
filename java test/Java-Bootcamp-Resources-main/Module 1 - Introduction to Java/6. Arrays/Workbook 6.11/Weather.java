import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {

        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheit = celciusToFahrenheit(celsius);
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");

    }

    public static double[] celciusToFahrenheit(double[] celsius) {
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (celsius[i] / 5.0 * 9.0) + 32;
        }
        return fahrenheit;
    }

    public static void printTemperatures(double[] tempArr, String type) {
        System.out.print(type + ": ");
        for (double d : tempArr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
