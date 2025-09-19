import java.util.Scanner; //Scanner class to accept user input

public class Main {
    public static void main(String[] args){
      // This is my first java program
        /*
        This is a multi-line comment
         */

        // Lesson 4

        // Shopping Cart Program
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();

        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.print("Your total is: " + currency + total);

        sc.close();

    }
}
        // Lesson 3
        /* /// /////////////////////////////////////////////////*/
        /* Arithmetic Operators */

        // int x = 10;
        // int y = 3;
        // int z;

        // Addition
        // z= x + y ;

        // subtraction
        // z = x - y;

        // multiplication
        // z = x * y;

        // division
        // z = x / y;

        // remainder
        // z = x % y;

        // System.out.println(z);

        /* /// /////////////////////////////////////////////////*/

        /* Augmented Assignment Operators */

        // int x = 10;
        // int y = 2;

        // x += y;  // Addition
        // x -= y; // subtraction
        // x *= y; // multiplication
        // x /= y; // division
        // x %= y; // remainder

        // System.out.println(x);


        /* /// /////////////////////////////////////////////////*/

        /* Increment & Decrement Operators  */

        // int x = 1;
        /*

        Increment
        x = x + 1
        =>
        x += 1
        =>
        x++

        */

        /*

        Decrement
        x = x - 1
        =>
        x -= 1
        =>
        x--

        */

        //  System.out.println(x);


        /* Lesson 2


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("What is your GPA? ");
        double GPA = sc.nextDouble();

        System.out.print("Are you a Student? [true/false]: ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Your name is: " +name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is: " + GPA);
        if(isStudent){
            System.out.println("You are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled");
        }


        sc.close();
*/



//        System.out.println("I like Burger");
//        System.out.println("It's really good");
//        System.out.println("Buy me Burgers");


//        int gta = 6;
//        double pi = 3.14159;
//        char gender = 'M';
//        boolean isAdmin = true;
//
//        System.out.println("Your Name is: " + name + "\n" +
//                             "Your gender is: " + gender + "\n");
//        if(isAdmin){
//            System.out.println("You are an Admin");
//        } else {
//            System.out.println("You re not an Admin");
//        }


