package mahmood.raif;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Are you human or alien? ");
        String race =input.nextLine();
        GpaCalculator calculator = null;
        if ("human".equals(race)) {
            calculator = new GpaCalculatorImpl();
        }
        else {
            calculator = new AlienCalculatorGpaImpls();
        }

        //establishes variables
        int classesTaken;
        double averageGPA = 0;

        System.out.println("Hello, this a program where you can calculate your GPA on 4.0 grade scale.");
        System.out.println("");
        System.out.println ("How many classes do you take? ");
        classesTaken=input.nextInt();
        input.nextLine();
        calculator.setNumberOfClasses(classesTaken);

        for(int classPeriod = 0; classPeriod < classesTaken ; classPeriod++) {
            System.out.println ("What is your grade in class " + (classPeriod+1) +"?");
            String grade = input.nextLine();
            calculator.setGrade(classPeriod, grade);
        }
        averageGPA = calculator.calculateGpa();
        System.out.printf("Your final cumulative GPA is: " + "%.2f", averageGPA);
        input.close();
        System.out.println("");
        System.out.println("Thanks for using my program, have a nice day!");
    }
}
//Raif Mahmood
