import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in);

        double numeroUm = 0;
        
        System.out.println("Digite o valor do produto: ");
        numeroUm = scanner.nextDouble();

        double porcentagem = calcularporcentagem(numeroUm, scanner);
        System.out.println("Valor do produto com o aumento de 10% fica em: " + (numeroUm + porcentagem));
    
        scanner.close();
    }
    
    public static double calcularporcentagem(double numUm, Scanner scanner) {

        double calcularporcentagem = (numUm * 10 / 100); 
        return calcularporcentagem;
        
    }
}
