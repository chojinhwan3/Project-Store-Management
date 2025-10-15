// Creats a subclass that extends from the class TennisEquipment
public class Strings extends TennisEquipment{

  // Instance variables for the Strings
  private boolean polyester;
  private String material;

  // Non-paramaterized constructor for Strings that sets default variables of my instance variables
  public Strings(){
    polyester = false;
    material = "none";
  }

  // Parameterized constructor that sets values to the instance variables based on what the person inputs
  public Strings(String brand, boolean isUsed, double price, int quantity, boolean polyester, String material){
    super(brand, isUsed, price, quantity);
    this.polyester = polyester;
    this.material = material;
  }

  // Accessor method for Polyester
  public boolean getPolyester(){
    return polyester;
  }

  // Accessor method for the material
  public String getMaterial(){
    return material;
  }

  // Mutator method for Polyester
  public void setPolyester(boolean newPolyester){
    polyester = newPolyester;
  }

  // Mutator method for the material
  public void setMaterial(String newMaterial){
    material = newMaterial;
  }

  // This is a toString method that displays the instance variables and uses | to seperate the different instance variables
  public String toString(){
    return "Strings:" + super.toString() + " | Is Polyester - " + polyester + " | " + material; 
  }
  
}