public class numbertriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //space
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
