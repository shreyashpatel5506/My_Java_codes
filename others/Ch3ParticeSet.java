import java.util.Scanner;
public class Ch3ParticeSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string::");
        String str= input.nextLine();
        //Question 1
        System.out.println("Here is the lower case of the string::" + str.toLowerCase());
        
        //Question 2
        System.out.print("String Space replace with underscore::"+ str.replace(" ", "_"));
        
        //Question 3
        String letter= "Dear <|name|>, Thanks a lot";
        System.out.print("Enter your name::");
        String name= input.next();
        System.out.print(letter.replace("<|name|>", name));

        //Question 4
        String myString= "This string contains double and triple spaces";
        System.out.println(myString.replace("  ", " "));
        System.out.println(myString.replace("   ", " "));

        //Question 5
        String letter1= "Dear Harry,\n\tThis Java Course is nice.\nThanks!";
        System.out.println(letter1);

        
        input.close();
    }
}
