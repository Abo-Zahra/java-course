


public class Main {
    public static void main(String[] args){

        /* Useful string methods in java */

        String name = "Abdullah AbdulMajeed";

        int length = name.length(); // the length of the string variable
        char letter = name.charAt(0); // choose the index of the required letter
        int index = name.indexOf("b"); // the first index value of a chosen letter
        int lastIndex = name.lastIndexOf("b");

        // name = name.toUpperCase(); // to change the values to uppercase
        // name = name.toLowerCase();
        // name = name.trim(); // to remove any white spaces
        // name = name.replace("a", "d");
        // name.isEmpty(); // to check if the string variable is empty or not


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        /*
        if (name.isEmpty()){
            System.out.println("your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name DOESN'T contain any spaces");
        }
         */
    }
}
