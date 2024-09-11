import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor (a kind of method) for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2008;
        System.out.println("We were actually founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();

        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay( "Latte" );
        countCups( 100 );
        baristasChoice( "Matcha" );

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink drink1 = new CoffeeDrink(7, "Vanilla", true);
        CoffeeDrink drink2 = new CoffeeDrink(5, "Mocha", false);
        CoffeeDrink drink3 = new CoffeeDrink(3, "Chocolate", true )
        // TODO
        // Print out the order details
        drink1.printInfo();
        drink2.printInfo();
        drink3.printInfo();


    } // end of constructor

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        //this is called casting a double forcing it to be an integer

        int discount = (int)(Math.random() * 31);
        System.out.println("You're random discount is going to be " + discount + "%!");

        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        System.out.println("Today's special is " + special + "!");

        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
    }

    // Method to show loops
    public void countCups(int cups ) {


        // TODO
        // Write three different for loops that print the indicated numbers:
        // follow this format to create for loops: "int i = 0; i < 10; i++" 0 is the starting point,
        // 10 is the ending point/condition, and ++ is the increment.
        // Print 1 to 5
        for (int x = 1; x <= 5; x++) {
            System.out.println(x + " cups");
        }

        // Print 2, 5, 8, 11
        for (int x = 2; x <= 11; x += 3) {
            System.out.println(x + " cups");
        }
        // Print 8 to 0
        for (int x = 8; x >= 0; x--) {
            System.out.println(x + " cups");
        }

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice(String drink) {

        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        // This is the structure for an if else variable statement

        double randomNum = Math.random() * 1;
            if (randomNum <0.25) {
                System.out.println("The barista recommends a Latte.");
            } else if (randomNum >= 0.25 &&  randomNum < 0.50 ){
                System.out.println("The barista recommends a Ice Coffee.");
            } else if (randomNum >= 0.50 && randomNum < 0.75) {
                System.out.println("The barista recommends a americano.");
            } else {
                System.out.println("The barista recommends a water.");
            }

        }


    }



