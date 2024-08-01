public class Main_2 {

    int x; // Create a class attribute

    // Create a class constructor for the Main class
    public Main_2() {
        x = 5; // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Main_2 myObj = new Main_2(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x
    }

}
