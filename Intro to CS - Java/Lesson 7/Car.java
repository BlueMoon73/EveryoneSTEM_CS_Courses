public class Car {
    // Private field
    private int releaseYear = 2001;

    // Public methods for accessing and modifying the private field
    public String getName() {
        return name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // ------------------------------- The Static Keyword -------------------------------

    static int myStaticInt = 3;
    static String myStaticString = "Hey!";
    static void myStaticMethod() {
        System.out.println("This a static method! ");
    }
}
