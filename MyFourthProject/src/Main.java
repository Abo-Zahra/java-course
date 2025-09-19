import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        /*

        // constant Math class values
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        // Math available functions
        result = Math.pow(2, 4); // 2 to the power of 4
        result = Math.abs(-5); // to give the absolute value
        result = Math.sqrt(9) // the square root
        result = Math.round(3.14); // rounding
        result = Math.ceil(3.14); // ceiling
        result = Math.floor(3.99);
        result = Math.max(10, 20); // what is the max between these values
        result = Math.min(10, 20); // what is the minimum between these values

        System.out.println(result);
        */
// / ///////////////////////////////////////////////
        /* Math exercise  1
        // 1- HYPOTENUSE: c = Math.sqrt(a^2 +b^2)

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        scanner.close();

        */

// ////////////////////////////////////////

        /* Math exercise  2 */

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius value: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is: " + circumference + "cm");
        System.out.println("The area is: " + area + "cm²"); // alt + 0178 = cm²
        System.out.println("The volume is: " + volume + "cm³"); // alt + 0179 = cm³

        scanner.close();

    }
}
