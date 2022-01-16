/**Escreva um algoritmo (de preferência em Java) que gere uma tabela com a conversão de Fahrenheit para Celsius com valores variando de 0 a 100 graus Celsius. Descreva quais são as Entradas, Saídas e Processamento do algoritmo [Use o laço For (Para)]**/

package URI;

public class Exercise3 {
    
public static void main(String[] args){

    double celsius = 0;
    double fahre = 32;
    
       for (int cont = 0; cont <= 100; cont++){ 
               celsius = (fahre - 32) * 5/9;
               System.out.println("Conversão:"+ celsius +"ºC - "+ fahre +" ºF ");
               fahre++;

       }
   }
}