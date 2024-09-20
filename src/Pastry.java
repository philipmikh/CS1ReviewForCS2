//
public class Pastry {
    private int number;
    private String name;
    private String type;
    //In your JavaBeansAndBytes project, create a new class called Pastry.java.
    //Declare 3 private variables in Pastry.java: name, type, and number.
    // Write a "getter" and "setter" method for each variable.
    //Your Pastry class should also have a constructor that takes three parameters.
    //In JavaBeansAndBytes.java, declare a new Pastry with parameters of your choice
    //Show that your "getter" and "setter" methods are working by using them.

    public Pastry(int numberOfPastries, String flavorOfPastries, String hasChocolateChip ){
        this.number = numberOfPastries;
        this.name = flavorOfPastries;
        this.type = hasChocolateChip;


    }
    //getter method for name
    public String getName() {
        return name;
    }
    //setter method for Name
    public void setName(String newName) {
        name = newName;
    }
    //getter method for number
    public int getNumber() {
        return number;
    }
    //setter method for number
    public void setNumber(int newNumber) {
        number = newNumber;
    }
    //getter method for type
    public String getType() {
        return type;
    }
    //setter method for type
    public void setType(String newType) {
        type = newType;
    }

}
