import java.util.Scanner;

public class Calculator {
    public static void Addition(double a, double b){
        double sum = a + b;
        System.out.println("Addition of number : "+sum);
    }
    public static void Subtraction(double a, double b){
        double subtract = a - b;
        System.out.println("Subtraction of number : "+subtract);
    }
    public static void Multiplication(double a, double b){
        double multiply = a * b;
        System.out.println("Multiplication of number : "+multiply);
    }
    public static void Division(double a, double b){
        double divide = a / b;
        System.out.println("Division of number : "+divide);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                    CALCULATOR                    |");
        System.out.println("|--------------------------------------------------|");

     while (true) {
         System.out.println();
         System.out.println("|------------------------------------------------|");
         System.out.println("|                press 1 Addition                |");
         System.out.println("|                press 2 Subtraction             |");
         System.out.println("|                press 3 Multiplication          |");
         System.out.println("|                press 4 Division                |");
         System.out.println("|                press 5 Exit                    |");
         System.out.println("|------------------------------------------------|\n");

         System.out.println("Enter your choice : ");
         int choice = input.nextInt();
         switch (choice) {
             case 1:
                 System.out.println("Enter first number : ");
                 double a = input.nextInt();
                 System.out.println("Enter second number : ");
                 double b = input.nextInt();
                 Addition(a, b);
                 break;

                 case 2:
                     System.out.println("Enter first number : ");
                     double first = input.nextInt();
                     System.out.println("Enter second number : ");
                     double second = input.nextInt();
                     Subtraction(first,second);
                     break;

                     case 3:
                         System.out.println("Enter first number : ");
                         double num1 = input.nextInt();
                         System.out.println("Enter second number : ");
                         double num2 = input.nextInt();
                         Multiplication(num1,num2);
                         break;

                         case 4:
                             System.out.println("Enter first number : ");
                             double d1 = input.nextInt();
                             System.out.println("Enter second number : ");
                             double d2 = input.nextInt();
                             if (d1 == 0 && d2 == 0) {
                                 System.out.println("Error: Division by Zero");
                             }else if (d2 < 1){
                                 System.out.println("Division by zero is not allowed");
                             }else {
                                 Division(d1,d2);
                             }
                              break;
                             case 5:
                                System.exit(0);
                                 break;
         }
     }
    }
}