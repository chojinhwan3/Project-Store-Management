x// Creats a subclass that extends from the class TennisEquipment
public class Racket extends TennisEquipment{

  // Instance variables for the racket
  private boolean headLight;
  private String color;

  // Non-paramaterized constructor for racket that sets default variables of my instance variables
  public Racket(){
    headLight = false;
    color = "none";
  }

  // Parameterized constructor that sets values to the instance variables based on what the person inputs
  public Racket(String brand, boolean isUsed, double price, int quantity, boolean headLight, String color){
    super(brand, isUsed, price, quantity);
    this.headLight = headLight;
    this.color = color;
  }

  // Accessor method for HeadLight
  public boolean getHeadLight(){
    return headLight;
  }

  // Accessor method for the color
  public String getColor(){
    return color;
  }

  // Mutator method for Headlight
  public void setHeadLight(boolean newHeadLight){
    headLight = newHeadLight;
  }

  // Mutator method for the color
  public void setColor(String newColor){
    color = newColor;
  }

  // This is a toString method that displays the instance variables and uses | to seperate the different instance variables
  public String toString(){
    return "Racket:" + super.toString() + " | Is headlight - " + headLight + " | " + color; 
  }
  
}