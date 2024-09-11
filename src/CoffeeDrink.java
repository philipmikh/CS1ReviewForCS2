// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;

        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        // the area between the () accepts the 3 parameters in the constructor for each of the
        //different variables
        //the Variables can be used anywhere in the whole class when "CoffeeDrink" is mentioned
        // purple = class-wide version     white = parameter version
        //java defaults to the variable with the smallest scope

    }


    // Method to print information about the CoffeeDrink
    public void printInfo() {
        System.out.println("You ordered " + numberOfCups + " cups of " + flavor + " coffee.");
        //System.out.println("It is " + hasWhippedCream + " that you your coffee has whipped cream.");
        if (hasWhippedCream == true){
            System.out.println("By the way, we put extra whipped cream in your coffee!");
        } else{
            System.out.println("By the way, we ran out of whipped cream, sorry!");
        }
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
