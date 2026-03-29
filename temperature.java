import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter source unit (C, F, K): ");
        char fromUnit = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter target unit (C, F, K): ");
        char toUnit = scanner.next().toUpperCase().charAt(0);

        double result = temp;

        if (fromUnit == toUnit) {
            // No conversion needed
            result = temp;
        } else if (fromUnit == 'C') {
            if (toUnit == 'F') {
                result = temp * 9 / 5 + 32;
            } else if (toUnit == 'K') {
                result = temp + 273.15;
            }
        } else if (fromUnit == 'F') {
            if (toUnit == 'C') {
                result = (temp - 32) * 5 / 9;
            } else if (toUnit == 'K') {
                result = (temp - 32) * 5 / 9 + 273.15;
            }
        } else if (fromUnit == 'K') {
            if (toUnit == 'C') {
                result = temp - 273.15;
            } else if (toUnit == 'F') {
                result = (temp - 273.15) * 9 / 5 + 32;
            }
        } else {
            System.out.println("Invalid source unit.");
            scanner.close();
            return;
        }

        System.out.printf("Converted temperature: %.2f %c
", result, toUnit);
        scanner.close();
    }
}
