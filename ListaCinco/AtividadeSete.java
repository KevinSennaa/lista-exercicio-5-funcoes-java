import java.util.Scanner;

public class AtividadeSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de número positivo ou negativo:");
        
        System.out.println("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        char resultado = verificarPositivo(numero);
        
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static char verificarPositivo(int numero) {
        
    if (numero > 0) {                       
    return 'P';
        } 
       
    else {               
    return 'N';
        }
    }
    
}
    
