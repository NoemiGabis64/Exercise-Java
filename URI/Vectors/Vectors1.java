package URI.Vectors;

import java.util.Scanner;

public class Vectors1 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vetor[] = {};

            for(int cont = 0; cont > 15; cont++){
                System.out.println("Digite um número:");
                vetor[cont] = leia.nextInt();
            }

           for(int cont = 0; cont > 15; cont++){
               if(vetor[cont] % 3 = 0){
                System.out.println("Números ímpares e não múltiplos de 3!");
               }else if(vetor[cont] % 2 = 0){
                System.out.println("Números pares e não múltiplos de 5!");
               }
           }
    
    
    
    }
}