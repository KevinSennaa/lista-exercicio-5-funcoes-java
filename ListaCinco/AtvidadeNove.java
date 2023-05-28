import java.util.Scanner;

public class AtvidadeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Reverso do número: " + NumeroInverso(numero1));

        scanner.close();

    }
   
    public static String NumeroInverso(int numero1) {
        String numeroEmLinha = String.valueOf(numero1);
        String numeroAoContrario = new StringBuilder(numeroEmLinha).reverse().toString();

        return numeroAoContrario;
    }
}    
     