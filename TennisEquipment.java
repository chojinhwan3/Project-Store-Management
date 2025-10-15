public class TennisEquipment{

  //Creating my instance variables for the tennis equpiemtn
  private String brand;
  private boolean isUsed;
  private double price;
  private int quantity;


  // This is a non paramaterized constructor that sets default values to the instance variables 
  public TennisEquipment(){
    this("unknown", false, 0.0, 0);
  }

  // This is a parameterized constructor that sets values to the instance variables depending on user input */
  public TennisEquipment(String brand, boolean isUsed, double price, int quantity){
    this.brand = brand;
    this.isUsed = isUsed;
    this.price = price;
    this.quantity = quantity;

  }

  // Accessor method for the brand
  public String getBrand(){
    return brand;
  }
// Acdessor method for isUsed
  public boolean getIsUsed(){
    return isUsed;
  }

  // Accessor method for the price
  public double getPrice(){
    return price;
  }

  // Accessor method for quantity of objects
  public int getQuantity(){
    return quantity;
  }

  // Mutator method for the name 
  public void setBrand(String newBrand){
    brand = newBrand;
  }
  
  // Mutator method for isUsed
  public void setIsUsed(boolean newIsUsed){
    isUsed = newIsUsed;
  }

  // Mutator method for the price
  public void setPrice(double newPrice){
    price = newPrice;
  }
  
  // Mutator method for the quantity 
  public void setQuantity(int newQuantity){
    quantity = newQuantity;
  }

  // This is a toString method that displays the instance variables and uses | to seperate the different instance variables
 public String toString(){
    return " " + brand + " | Is used? " + isUsed + " | $" + price + " | How many? - " + quantity;
  }
  
}