public class Car {
    // Private field
    private String name;
    private int releaseYear = 2001;

    // Public methods for accessing and modifying the private field
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    // ------------------------------- The Static Keyword -------------------------------

    static int myStaticInt = 3;
    static String myStaticString = "Hey!";
    static void myStaticMethod() {
        System.out.println("This a static method! ");
    }
}
