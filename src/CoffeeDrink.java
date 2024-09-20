// CoffeeDrink object class

class CoffeeDrink {

    public int numberOfCups;
    private String flavor;
    public boolean hasWhippedCream;

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

    //TODO
    //method overloading with constructor
    public CoffeeDrink(){
        numberOfCups = 1;
        flavor = "coffee";
        hasWhippedCream = false;
        //default coffee order
        //default to 1 cup

    }

    public CoffeeDrink(int paramNumberOfCups){
        numberOfCups = paramNumberOfCups;
        flavor = "coffee";
        hasWhippedCream = false;
        //default to whatever the parameter number was

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

    //"getter" method for flavor variables - to be able to get/see another flavor from a different class
    public String getFlavor(){
        return flavor;
    }
    //"setter" method for flavor variables
    public void setFlavor(String flavor){
        this.flavor = flavor;

    }
}
