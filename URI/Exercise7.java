/**Write a program that reads an employee's number, his/her worked hours number in a month and the amount 
 * he received per hour. Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.*/
package URI;


import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        
        try (Scanner input = new Scanner(System.in)) {
            
            int employee = 0;
            int hour = 0;
            double hoursalary = 0;
            double definitivesalary = 0;

            employee = input.nextInt(); 
            hour = input.nextInt();
            hoursalary = input.nextDouble();

            definitivesalary = (hour * hoursalary) ; 

            System.out.printf("NUMBER = %d\n", employee);
            System.out.printf("SALARY = U$ %.2f\n", definitivesalary);
        }
    }
}