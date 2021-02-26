// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.*; // Needed for the Scanner class to read input

public class custom_order {

  // Extra stip
  static int totalCost;
  static String addOnList;

  // STEP 1 PRINTING HELLO WORLD TO CONSOLE
  public static void main(String[] args) {

    System.out.println("Hello World!"); // print Hello World to console

    // TEST CODE

    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
    Scanner keyboard = new Scanner(System.in);

    String firstName; // The user first name variable
    String itemOrder; // Item order
    String frostingType; // Frosting order
    String fillingType; // Filling order
    String toppings; // Toppings ordered
    String input; // User input
    double cost = 15.00; // Cost of cake and cupcakes
    final double TAX_RATE = .08; // Sales tax rate
    double tax; // Amount of tax

    // Introduce shop and prompt user to input first name
    System.out.println("Welcome to Javas Cake & Cupcake Shop!");
    System.out.println("We make custom cakes with our secret cake batter!");

    // TEST CODE

    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
    System.out.print("What is your first name? ");
    firstName = keyboard.nextLine();

    System.out.println(firstName + ", please see our MENUE below: ");
    System.out.print("\n");
    // TEST CODE

    // STEP 4 DISPLAY MENU
    System.out.println("________________________________________________");
    System.out.println("\tMENUE \tQUANTITY \tBASE COST");
    System.out.println("_________________________________________________");
    System.out.println("\tCake \t1 \t$15");
    System.out.println("\tSet of Cupcakes \t6 \t$15");
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println("Frostings (Vanilla, chocolate, strawberry, coco)");
    System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
    System.out.println("Toppings (sprinkless, cinnamon, cocoa, nuts)");
    System.out.println("________________________________________________");

    // TEST CODE

    // STEP 5 PROMPT USER TO ORDER
    System.out.println("Do you want CUPCAKES or a CAKE?");
    itemOrder = keyboard.nextLine();

    // TEST CODE

    // STEP 6 PROMPT USER TO CHOOSE FROSTING

    System.out.println("What type of FROSTING do you want? ");
    System.out.println("Vanilla, Chocolate, Strawberry or Coco");
    frostingType = keyboard.nextLine();
    if (frostingType != "no") {
      addItem(frostingType, 2);
      addOnList += ", ";
    }
    // TEST CODE

    // STEP 7 PROMPT USER TO CHOOSE FILLING

    System.out.println("What type of FILLING do you want? ");
    System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
    fillingType = keyboard.nextLine();
    if (fillingType != "no") {
      addItem(fillingType, 2);
      addOnList += ", ";
    }

    // TEST CODE

    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS

    System.out.println("What type of TOPPINGS do you want? ");
    System.out.println("Sprinkless, Cinnamon, Cocoa, Nuts");
    toppings = keyboard.nextLine();
    if (toppings != "no") {
      addItem(toppings, 2);
      addOnList += ", ";
    }

    // TEST CODE

    // STEP 9 DISPLAY ORDER CONFIRMATION
    System.out.println();
    System.out.println(firstName + " , your order is as follows: ");
    System.out.println("_________________________________________________");
    System.out.println("Item Ordered: " + itemOrder);
    System.out.println("Frosting: " + frostingType);
    System.out.println("Filling: " + fillingType);
    System.out.println("Toppings: " + toppings);
    System.out.println("_________________________________________________");

    // TEST CODE

    // STEP 10 DISPLAY COST AND SALES TAX
    System.out.printf("The cost of your order is $%.2f\n", cost);
    tax = cost * TAX_RATE;
    System.out.printf("The tax is: $%.2f\n", tax);
    System.out.printf("The total due is: $%.2f\n", (tax + cost));

  }

  // belongs to extra step
  static void addItem(String item, int cost) {
    totalCost += cost;
    addOnList += item;
  }
}