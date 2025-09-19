import java.util.Random; // java random class

public class Main {
    public static void main(String[] args){

        Random random = new Random();

        int number;
        double number2;
        boolean isHeads; // Flip a coin example

       // number = random.nextInt(); // this will generate a large number

        number = random.nextInt(1 , 6); // this will limit the outputted number between 1 and 6
        System.out.println(number);

        number2 = random.nextDouble();
        System.out.println(number2);

        isHeads = random.nextBoolean();
        if (isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

    }
}
