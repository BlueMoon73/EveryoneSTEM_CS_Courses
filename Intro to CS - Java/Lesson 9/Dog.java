public class Dog extends Animal{
        @Override // it lets the compiler know that you are overriding the sound() in the Animal Class
        void sound() {
            System.out.println("The dog barks");
        }
    }

