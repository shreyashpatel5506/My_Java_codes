import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

      while (true){
        System.out.println("Enter the first number");
        int a = input.nextInt();
        String operator;
         System.out.println("Enter the operator");
        operator = input.next();
         System.out.println("Enter the second number");
         int b = input.nextInt();
      switch (operator ){
        case "+":
          System.out.println("Addition:--" + (a + b));
          break;
        case "-":
          System.out.println("Subtraction:--" + (a - b));
          break;
        case "*":
          System.out.println("Multiplication:--" + (a * b));
          break;
        case "/":
        if(b == 0){
            System.out.println("Division by zero is not possible so we interchange the numbers");
            int temp = a;
            a = b;
            b = temp;
        }
          System.out.println("Division:---" + (a / b));
          break;

        case "%":
          System.out.println("Modulus:--" + (a % b));
          break;

        case "^":
          System.out.println("Power:--" + Math.pow(a, b));
          break;
        case "E":
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Operator");
          break;
      }
    }

    }
}
