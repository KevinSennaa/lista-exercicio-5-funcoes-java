import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Informe o primeiro numero: ");
            int numero1 = scanner.nextInt();
            
            Contar(numero1);
        scanner.close();
    }

    public static void Contar(int maximo){
        int contador = 0;

        while(contador <= maximo){
            contador++;
            System.out.print("(");
            for(int i = 1; i <= contador; i++){
                System.out.print(contador + ",");     
            }
            System.out.println(")");

        }
        
    }
}