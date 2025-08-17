public class Butterfly {
    public static void main(String[] args) {
        //first Half
        for (int i = 1; i <= 5; i++) {
            //star
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(5-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //secondHalf
        for (int i = 5; i >= 1; i--) {
            //star
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= 2*(5-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
