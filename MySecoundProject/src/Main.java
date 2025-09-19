import java.util.Scanner;


public class Main {
    public static void  main(String[] args) {
        // if statement = preforms a block of code if it's condition is true

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("What is your name?: ");
        name = sc.nextLine();

        System.out.print("How old are you?: ");
        age = sc.nextInt();

        System.out.print("Are you a student? (true/false):");
        isStudent = sc.nextBoolean();

        // Group 1
        if (name.isEmpty()){
            System.out.println("You didn't enter your name!");
        } else {
            System.out.println("Hello there " + name + "!");
        }

        // Group 2
        if(age >= 65){
            System.out.println("You are a senior!");
        } else if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        }else {
            System.out.println("You are a child!");
        }

        // Group 3
        if (isStudent){
            System.out.println("You are a student!");
        } else {
            System.out.println("You are NOT a student!");
        }

        sc.close();

    }
}
