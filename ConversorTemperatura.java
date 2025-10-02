import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Calcula as temperaturas convertidas
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\nPráticas");
        System.out.println("Temperatura em Celsius: " + celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");

        scanner.close();
    }
}
