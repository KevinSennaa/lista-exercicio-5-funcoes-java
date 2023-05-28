import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args) {
        
        double temperaturaFahrenheit = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite para a conversão em temperatura Fahrenheit para Celsius: ");
        temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = conversaoTemperatura(temperaturaFahrenheit, scanner);
        System.out.println("A temperatura em celsius é: " + temperaturaCelsius);
 
        scanner.close();
    }

    public static double conversaoTemperatura(double numUm, Scanner scanner) {
        
        double calcularTemperatura = ((numUm - 32) / 1.8) ;
        return calcularTemperatura;
    }
    
}
