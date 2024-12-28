public class StringBasic {
    public static void main(String[] args) {

        // String is a class in Java
        String name = new String("Shreyash");
        System.out.println(name);

        // String by simple way
        String str = "  Hello World";
        System.out.println(str);

        //by using printf and format method
        System.out.printf("This is a string %s", str);
        System.out.println();
        System.out.format("This is a string %s", str);

        System.out.println("string length: " + str.length());
        System.out.println("string to lower case: " + str.toLowerCase());
        System.out.println("string to upper case: " + str.toUpperCase());
        System.out.println("string trim: " + str.trim() + "now the length is: " + str.trim().length());
        System.out.println("string substring: " + str.substring(5));
        System.out.println("string substring: " + str.substring(2, 5));
        System.out.println("string replace: " + str.replace("Hello", "Hi"));
        System.out.println("string starts with: " + str.startsWith("Hello"));
        System.out.println("string ends with: " + str.endsWith("World"));
        System.out.println("string char at: " + str.charAt(2));
        System.out.println("string index of: " + str.indexOf("World"));
        System.out.println("string last index of: " + str.lastIndexOf("World"));
        System.out.println("string equals: " + str.equals("Hello World"));
        System.out.println("string equals ignore case: " + str.equalsIgnoreCase("Hello World"));
        System.out.println("string concat: " + str.concat("I am Shreyash"));
        System.out.println("string contains: " + str.contains("Hello"));
        System.out.println("string is empty: " + str.isEmpty());
        // System.out.println("string to char array: " + str.toCharArray());
        System.out.println("string split: " + str.split(" "));
        System.out.println("string join: " + String.join(" ", "Hello", "World"));
        System.out.println("string format: " + String.format("This is a string %s", str));

        //string index of example
        String para = "Hello, I am Shreyash. I am a student.";
        System.out.println(para.indexOf("am"));
        System.out.println(para.indexOf("am", 5));
        System.out.println(para.indexOf("am", 10));
        System.out.println(para.indexOf("am", 15));
        System.out.println(para.indexOf("am", 20));
        System.out.println(para.indexOf("am", 25));
        System.out.println(para.indexOf("am", 30));
        //last index of example
        System.out.println(para.lastIndexOf("am"));
        System.out.println(para.lastIndexOf("am", 5));
        System.out.println(para.lastIndexOf("am", 20));
        

    } 

}