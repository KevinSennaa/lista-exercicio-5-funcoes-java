import java.util.Scanner;

public class AtividadeSeis {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                       
        int numeroUm = 20;
                 
        int numeroDois = 6;
                  
        int numeroTres = 14;
    
    int soma = calcularSoma(numeroUm, numeroDois, numeroTres);
    
            System.out.println("A soma dos três números é: " + soma);

        scanner.close();

    }
    
    public static int calcularSoma(int num1, int num2, int num3) {
            int soma = num1 + num2 + num3;
            return soma;
        }
    }