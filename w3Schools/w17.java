package w3Schools;

public class w17 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        String firstbinary = "10";
        String secondbinary = "11";
        int first = Integer.parseInt(firstbinary, 2);
        int second = Integer.parseInt(secondbinary, 2);
        int sum = first + second;
        System.out.println(Integer.toBinaryString(sum));
    }
}