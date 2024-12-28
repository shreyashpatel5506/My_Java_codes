import java.util.Scanner;
public class Chapter4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even");
    }
        else{
            System.out.println("The number is odd");
        }

        //3rd question
        int marks = input.nextInt();
        if(marks >= 90){
            System.out.println("A+");
        }
        else if(marks >= 80){
            System.out.println("A");
        }
        else if(marks >= 70){
            System.out.println("B");
        }
        else if(marks >= 60){
            System.out.println("C");
        }
        else if(marks >= 50){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

        //4th question
        int income = input.nextInt();
        if(income <= 50000){
            System.out.println("No tax");
        }
        else if(income <= 100000){
            System.out.println("10% tax");
        }
        else if(income <= 150000){
            System.out.println("20% tax");
        }
        else{
            System.out.println("30% tax");
        }

        //5th question
        int day = input.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
        }

        //6th question
        int year = input.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }

        //7th question
        String website= input.next();
        if(website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Invalid website");
        }
        input.close();
    }
}
