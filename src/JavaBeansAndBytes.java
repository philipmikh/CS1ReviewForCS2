import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

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
    //public void means new method
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
        CoffeeDrink drink3 = new CoffeeDrink(3, "Chocolate", true );
        CoffeeDrink drink4 = new CoffeeDrink(8);
        CoffeeDrink drink5 = new CoffeeDrink();



        // TODO
        // Print out the order details
        drink1.printInfo();
        drink2.printInfo();
        drink3.printInfo();
        drink4.printInfo();
        drink5.printInfo();
        System.out.println("drink 2 flavor is" + drink2.getFlavor());


       // customDrink();
        returnTypes(5);//this is calling the returnTypes
        //you can treat this line as in integer
        System.out.println("***" + returnTypes(5));

        System.out.println(returnString());

        System.out.println(returnDistance(2,1,3,4));

        //Creating a new pastry object using my constructer
        Pastry pastry = new Pastry(10, "Chocolate", "Cake");

        //using the getter methods to print out the pastry object
        System.out.println("*************");
        System.out.println("Pastry flavor is " + pastry.getName());
        System.out.println("Pastry type is " + pastry.getType());
        System.out.println("Pastry number is" +  pastry.getNumber());

        pastry.setName("Vanilla");
        pastry.setType("Cookie");
        pastry.setNumber(20);

        System.out.println("Updated pastry flavor is " + pastry.getName());
        System.out.println("Updated pastry type is " + pastry.getType());
        System.out.println("Updated pastry number is" +  pastry.getNumber());

    } // end of constructor

    public double returnDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        return distance;
    }
    //public + type of variable we return + name of method
    public int returnTypes(int a){//method signeture or method definition
        return a;

    }

    public String returnString(){
        String name =  "Bob";
        return name;

    }

    //Method to take a custom drink order from a customer
    public void customDrink(){
        //scanner for user input
        Scanner scanner = new Scanner(System.in);//"in" refers to user texting into the code

        System.out.println("How many cups of coffee do you want?");
        int nCups = scanner.nextInt();

        System.out.println(nCups);
    }
    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        //this is called casting a double forcing it to be an integer
        // Make this method generate a random integer discount (0-30%)
        // and print the result.

        int discount = (int)(Math.random() * 31);
        System.out.println("You're random discount is going to be " + discount + "%!");
        // a while loop is very good for looping an unknown number of times until some condition is met

        while (discount<25){
            discount = (int)(Math.random() * 31);
            System.out.println("You're random discount is going to be " + discount + "%!");

        }
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
        int n = 1;
        //normal integer decleration
        while(n<6){
            System.out.println(n);
            n = n+1;
            //n++;
            //n+=1

        }
        //writing a for loop with a "while" loop

        // Print 2, 5, 8, 11
        for (int x = 2; x <= 11; x += 3) {
            System.out.println(x + " cups");
        }
        int x=2;
        while(x<=11){
            System.out.println(x);
            x = x+3;


        }
        // Print 8 to 0
        for (int y = 8; x >= 0; x--) {
            System.out.println(x + " cups");
        }

        int y=8;
        while(y>-1){
            System.out.println(y);
            y = y-1;
        }

        int p = 0;
        while(true){
            System.out.println(p);
            if (p > 100){
                break; //"break" ends the loop
            }
            p++;
            if (p % 5 ==0){//print the multiples of 5
                System.out.println(p);
            }
            p++;
        }
        System.out.println("end of while loop");


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



