/**Make the algorithm (preferably in Java). A certain soccer club wants to classify its athletes in categories that are
defined depending on their age group, as shown in the table below:

AGE

CATEGORY
From 05 to 10
Children
11 to 15
Juvenile
From 16 to 20
Junior
From 21 to 25
Professional
Over 25
None

Build a program that asks for the athlete's Name and Age and then prints his or her Category. The program should END when the user types EXIT.
After it finishes it must print the QUANTITY of athletes that are in EACH category and the AVERAGE of the ages of the athletes in EACH category.

Translated with www.DeepL.com/Translator (free version)**/

package URI;
import java.util.Scanner;

public class Exercise2{

   public static void main(String[] args) {

       try (Scanner input = new Scanner(System.in)) {

        String name = " ";
        String ExitE = "EXIT";
           int i = 0;
           int i1 = 0;
           int i2 = 0;
           int i3 = 0;
           int i4 = 0;
           int i5 = 0;
           int year1 = 0;
           int year2 = 0;
           int year3 = 0;
           int year4 = 0;
           int year5 = 0;
           int year6 = 0;

           while (i != 5) {

               System.out.println("What is your name?");
               name = input.nextLine();

               System.out.println("What is your age?");
               year1 = input.nextInt();

               if (year1 <= 10) {
                   System.out.println("CHILDREN!");
                   i1++;
                   year2 = year1 + year2;
               } else if (year1 <= 15) {
                   System.out.println("YOUTH!");
                   i2++;
                   year3 = year1 + year3;
               } else if (year1 <= 20) {
                   System.out.println("JUNIOR!");
                   i3++;
                   year4 = year1 + year4;
               } else if (year1 <= 25) {
                   System.out.println("PROFISSIONAL!");
                   i4++;
                   year5 = year1 + year5;
               } else if (year1 > 25) {
                   System.out.println("INEXISTENT!");
                   i5++;
                   year6 = year1 + year6;
               }

               System.out.print("You wish to EXIT the program?");
               ExitE = input.next();

               if ("Exit".equals(ExitE)){
                   i = 5;
               }
           }

           System.out.println("Name:"+ name);
           System.out.println("\n"+"Average CHILDREN age is:" + year2);
           System.out.println("Average YOUTH age is:" + year3);
           System.out.println("Average JUNIOR age is:" + year4);
           System.out.println("Average PROFISSIONAL age is:" + year5);
           System.out.println("Average INEXISTENT age is:" + year6 + "\n");
           System.out.println("The number of athletes CHILDREN:" + i1);
           System.out.println("The number of athletes YOUTH:" + i2);
           System.out.println("The number of athletes JURNIOR:" + i3);
           System.out.println("The number of athletes PROFISSIONAL:" + i4);
           System.out.println("The number of athletes INEXISTENT:" + i5);
    }

   }

}