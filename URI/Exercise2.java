/**Faça o algoritmo (de preferência em Java). Um determinado clube de futebol pretende classificar seus atletas em categorias que são
definidas dependendo da sua faixa etária, conforme a tabela abaixo:

IDADE

CATEGORIA
De 05 a 10
Infantil
De 11 a 15
Juvenil
De 16 a 20
Junior
De 21 a 25
Profissional
Maior que 25
Inexistente

Construa um programa que solicite o Nome e a Idade do atleta e imprima em seguida a sua Categoria. O programa deve TERMINAR quando o usuário digitar SAIR.
Após o seu término deve-se imprimir a QUANTIDADE de atletas que estão em CADA categoria e a MÉDIA das Idades dos atletas de CADA Categoria.**/

package URI;
import java.util.Scanner;

public class Exercise2{

   public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {

        String name = " ";
        String sairE = "EXIT";
           int cont = 0;
           int cont1 = 0;
           int cont2 = 0;
           int cont3 = 0;
           int cont4 = 0;
           int cont5 = 0;
           int ide1 = 0;
           int ide2 = 0;
           int ide3 = 0;
           int ide4 = 0;
           int ide5 = 0;

           while (cont != 5) {

               System.out.println("Qual é seu nome?");
               name = input.nextLine();

               System.out.println("Qual é sua idade?");
               int ide = input.nextInt();

               if (ide <= 10) {
                   System.out.println("INFANTIL!");
                   cont1++;
                   ide1 = ide + ide1;
               } else if (ide <= 15) {
                   System.out.println("JUVENIL!");
                   cont2++;
                   ide2 = ide + ide2;
               } else if (ide <= 20) {
                   System.out.println("JUNIOR!");
                   cont3++;
                   ide3 = ide + ide3;
               } else if (ide <= 25) {
                   System.out.println("PROFISSIONAL!");
                   cont4++;
                   ide4 = ide + ide4;
               } else if (ide > 25) {
                   System.out.println("INEXISTENTE!");
                   cont5++;
                   ide5 = ide + ide5;
               }

               System.out.print("Você deseja SAIR do programa?");
               sairE = input.next();

               if ("Sair".equals(sairE)){
                   cont = 5;
               }
           }

           System.out.println("Nome:"+ name);
           System.out.println("\n"+"Média da idade INFANTIL é:" + ide1);
           System.out.println("Média da idade INFANTIL é:" + ide2);
           System.out.println("Média da idade INFANTIL é:" + ide3);
           System.out.println("Média da idade INFANTIL é:" + ide4);
           System.out.println("Média da idade INFANTIL é:" + ide5 + "\n");
           System.out.println("A quantidade de atletas INFANTIL:" + cont1);
           System.out.println("A quantidade de atletas JUNIVEL:" + cont2);
           System.out.println("A quantidade de atletas JURNIO:" + cont3);
           System.out.println("A quantidade de atletas PROFISSIONAL:" + cont4);
           System.out.println("A quantidade de atletas INEXISTENTE:" + cont5);
    }

   }

}