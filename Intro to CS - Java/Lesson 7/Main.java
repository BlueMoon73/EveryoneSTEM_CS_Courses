//*******************************************************************
// Author: Monish Saravana Kumar Divya Sundari
// Course: Everyone STEM - Intro to CS: Java
// Last Modified: 7/7/2023
//
// PURPOSE:
// - Contains all the code mentioned in Lesson 7 of, Everyone STEM's Intro to CS: Java Course.
//
// ASSUMPTIONS:
// - Assumes that you have read through the associated slides for this lesson.
//*******************************************************************

public class Main {

    // ------------------------------- Creating Objects  -------------------------------
    // this variable is declared inside the Main Class
    int x = 5;

    // this method is declared inside the Main Class
    public int addition(int x, int y){
        return x + y;
    }



    public static void main(String[] args) {
        // ------------------------------- Creating Objects  -------------------------------

        // this creates an object from the main class.
        Main sampleObject = new Main();

        //you can now access public variables and methods declared in the main class, using this object
        System.out.println(sampleObject.x);

        //you can do the same with public methods from inside the class
        System.out.println(sampleObject.addition(3,4));


        // you can create multiple objects using the same class
        Main object2 = new Main();

        System.out.println(object2.x);
        System.out.println(object2.addition(5,6));

        Main object3 = new Main();

        System.out.println(object3.x);
        System.out.println(object3.addition(5,6));

        // ------------------------------- Multiple Classes -------------------------------

        Person person1 = new Person("James");
        person1.sayHello(); // Output: Hello, my name is James


        // ------------------------------- Encapsulation & Abstraction -------------------------------
        Car myCar = new Car();

        // although the Name field is private, since it has a Getter and Setter, the values can be retrieved and modified
        myCar.setName("Honda");

        /*  since the releaseYear is private, and does not have a Getter and Setter, the values cannot be retrieved or modified.
            These lines would lead to an error as these fields are not public:
            myCar.name
            myCar.releaseYear
        */

        // ------------------------------- The Static Keyword -------------------------------

        Car.myStaticMethod();
        System.out.println(Car.myStaticInt);
        System.out.println(Car.myStaticString);

        // ------------------------------- Inheritance  -------------------------------

        Animal animal = new Animal();
        animal.sound();
        animal.drinkWater(); // outputs the same thing as animal.drinkWater()


        Cat cat = new Cat();
        cat.sound();
        animal.drinkWater(); // outputs the same thing as animal.drinkWater()

        // ------------------------------- Polymorphism  -------------------------------
        Pig pig = new Pig();
        Dog dog = new Dog();

        cat.sound();
        pig.sound();
        dog.sound();



    }
}



