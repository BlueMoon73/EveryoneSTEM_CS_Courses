// Subclass
public class Cat extends Animal {
    @Override // it lets the compiler know that you are overriding the sound() in the Animal Class
    void sound() {
        System.out.println("The cat meows");
    }
// The following method would return an error, as the drink() method in the animal class is overridden
//    @Override
//    void drinkWater(){
//
//    }


}