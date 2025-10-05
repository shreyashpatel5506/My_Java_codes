import java.util.Scanner;
public class Ch2PraticeSet {
    public static void main(String[] args) {
        // Question 1 show the output of the following float type calculation:
        Float a= 7.0f/4.0f*9.0f/2.0f;
        System.out.println(a);

        // Question 2 show the output of the following char type calculation:
        // by increase grade value
        char grade= 'B';
        grade= (char)(grade+8);
        System.out.println(grade);

        //decrypt 
        grade= (char)(grade-8);
        System.out.println(grade);


        // Question 3 show the output of the following inpput nuber greater than the system number:
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number greater than the system number: ");
        int num= sc.nextInt();
        int SystemNum= 10;
        if(SystemNum<num){
            System.out.println("The number is greater than the system number");
    }
    else{
        System.out.println("The number is less than the system number");
    }

    // Question 4 show the output of the following expression::
    int x= 7;
    int y= 4;
    int s=1;
    int r=2;
    System.out.println(((Math.pow(x,2)-Math.pow(y,2))/2*s*r));
 
    sc.close();   
}
}
