public class HollowRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //Space
            for (int j = 1; j <= (5-i); j++) {
                System.out.print(" ");
            }
            //Star
            for (int j = 1; j <=5; j++) {
                if (i == 1 || i == 5 || j == 1 || j ==5) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
