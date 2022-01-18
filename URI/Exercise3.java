/**Write an algorithm (preferably in Java) that generates a table 
 * with the conversion from Fahrenheit to Celsius with values ranging 
 * 0 to 100 degrees Celsius. Describe what are the Inputs, 
 * outputs and processing of the algorithm [Use the (For) loop]**/

package URI;

public class Exercise3 {
    
public static void main(String[] args){

    double celsius = 0;
    double fahre = 32;
    
       for (int i = 0; i <= 100; i++){ 
               celsius = (fahre - 32) * 5/9;
               System.out.println("Conversion:"+ celsius +"ºC - "+ fahre +" ºF ");
               fahre++;
       }
   }
}