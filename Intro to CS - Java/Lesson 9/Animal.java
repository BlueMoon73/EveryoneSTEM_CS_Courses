
// Superclass
public class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }

  void move(){
      System.out.println("The animal moved!");
  }

  // if the method is declared as final, it cannot be overridden.
  final void drinkWater(){
      System.out.println("The animal has drank water!");
  }
}