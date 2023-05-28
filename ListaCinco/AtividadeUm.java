import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        
        int numeroUm = 0, numeroDois = 0;

        Scanner scanner = new Scanner(System.in);

        // Chamando a função com retorno e armazenamento varíavel
        int media = calcularMediaAritimetica(numeroUm, numeroDois, scanner);
        System.out.println("Média realizaada dentro do método: " + media);
    
        scanner.close();
    }
    
    public static int calcularMediaAritimetica(int numUm, int numDois, Scanner scanner) {
        System.out.println("Digite o primeiro número: ");
        numUm = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        numDois = scanner.nextInt();
        
        int calcularMediaAritimetica = (numUm + numDois) / 2;
        return calcularMediaAritimetica;
    }
}
