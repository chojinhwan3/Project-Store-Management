import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    // Asks for the user to type in what type of object they want to store in the inventory 
    // and takes the value and uses that to determine what string of questions to ask next
  
    System.out.print("Which category do you want to store?\n1. Tennis Equipment\n2. Racket\n3. Strings\n");
    int a = input.nextInt();

    // If the user chooses the first option, then the program asks them these questions 
    // and prints out the instance variables for the tennis equipment
     
    if (a == 1){
      System.out.println("What is your tennis equipment's brand?");
      String userBrand = input.nextLine();
      userBrand = input.nextLine();
      System.out.println("Is it used (true/false)");
      boolean userIsUsed = input.nextBoolean();
      System.out.println("What price is the item?");
      double userPrice = input.nextDouble();
      System.out.println("How many of this item are you buying?");
      int userQuantity = input.nextInt();
      input.nextLine();
      //Creates the object
      TennisEquipment TennisEquipment = new TennisEquipment(userBrand, userIsUsed, userPrice, userQuantity);
      System.out.println("---------------------------------------------------------------------------------------------------------");
      System.out.println(TennisEquipment);
      
    }

    // If the user chooses the second option, then the program asks them these questions 
    // and prints out the instance variables for the racket
    
    if (a == 2){
      System.out.println("What is the racket's brand?");
      String userBrand = input.nextLine();
      userBrand = input.nextLine();
      System.out.println("Is it used? (true/false)");
      boolean userIsUsed = input.nextBoolean();
      System.out.println("What price is the item?");
      double userPrice = input.nextDouble();
      System.out.println("How many rackets are you buying?");
      int userQuantity = input.nextInt();
      input.nextLine();
      System.out.println("Is the racket headlight? (true/false)");
      boolean userHeadLight = input.nextBoolean();
      System.out.println("What color is the racket?");
      String userColor = input.nextLine();
      userColor = input.nextLine();
      //Creates the object
      Racket Racket = new Racket(userBrand, userIsUsed, userPrice, userQuantity, userHeadLight, userColor);
      System.out.println("---------------------------------------------------------------------------------------------------------");
      System.out.println(Racket);

        }

    // If the user chooses the third option, then the program asks them these questions 
    // and prints out the instance variables for the strings
    
      if (a == 3){
      System.out.println("What is the string's brand?");
      String userBrand = input.nextLine();
      userBrand = input.nextLine();
      System.out.println("Is it used? (true/false)");
      boolean userIsUsed = input.nextBoolean();
      System.out.println("What price is the item?");
      double userPrice = input.nextDouble();
      System.out.println("How many rolls of string are you buying?");
      int userQuantity = input.nextInt();
      input.nextLine();
      System.out.println("Are the strings polyester? (true/false)");
      boolean userPolyester = input.nextBoolean();
      System.out.println("What material is the string made of?");
      String userMaterial = input.nextLine();
      userMaterial = input.nextLine();
      //Creates the object
      Strings Strings = new Strings(userBrand, userIsUsed, userPrice, userQuantity, userPolyester, userMaterial);
      System.out.println("---------------------------------------------------------------------------------------------------------");
      System.out.println(Strings);

        }

    // Closes the scanner object
    input.close();

    }
  }