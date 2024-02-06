public class Construct {


    public Construct() {
        System.out.println("Default Constructor called");
    }


    public Construct(String message) {
        System.out.println("Parameterized Constructor called with message: " + message);
    }

    public static void main(String[] args) {

        Construct Obj = new Construct();

        // Creating an object using the parameterized constructor
        Construct Obj1 = new Construct("Hello, this is a parameterized constructor!");
    }
}
