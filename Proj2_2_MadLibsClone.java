import java.util.Scanner; // due to Scanner, so we don't type java.util.Scanner every time

public class Proj2_2_MadLibsClone { // saved as Proj2_2_MadLibsClone.java as class must match in Java with file name
    // access modifier public means this class can be accessed by anywhere
    public static void main(String[] args) { // public makes method accessible from anywhere, static means it belongs to the class not to any specific object/instance, void means it returns nothing, main is the method name - java looks main as the entry point - and it is like a rule the starting method must be named main, String[] args it is a parameter - an array of strings for command line arguments that can be passed to the program when it is run. String[] an array of String objects. args the variable name aka arguments.
        Scanner scanner = new Scanner(System.in); // The whole line creates a tool to read user input from the keyboard
        // Scanner is a class in java.util package, scanner is the name of the variable we are creating, new means we are creating a new instance of the Scanner class, System.in means we are reading input from the standard input stream (keyboard).
        // new is a keyword in Java used to create new objects.
        // System.in is an InputStream that represents the standard input stream, typically the keyboard.

        System.out.print("Enter ADJECTIVE1: "); // print instead of println to keep the cursor on the same line
        String adjective1 = scanner.nextLine();
        
        System.out.print("Enter GIRLS_NAME: ");
        String girlsName = scanner.nextLine();
        
        System.out.print("Enter ADJECTIVE2: ");
        String adjective2 = scanner.nextLine();
        
        System.out.print("Enter OCCUPATION1: ");
        String occupation1 = scanner.nextLine();
        
        System.out.print("Enter PLACE: ");
        String place = scanner.nextLine();
        
        System.out.print("Enter CLOTHING: ");
        String clothing = scanner.nextLine();
        
        System.out.print("Enter HOBBY: ");
        String hobby = scanner.nextLine();
        
        System.out.print("Enter ADJECTIVE3: ");
        String adjective3 = scanner.nextLine();
        
        System.out.print("Enter OCCUPATION2: ");
        String occupation2 = scanner.nextLine();
        
        System.out.print("Enter BOYS_NAME: ");
        String boysName = scanner.nextLine();
        
        System.out.print("Enter MANS_NAME: ");
        String mansName = scanner.nextLine();
        
        System.out.println("\nHere's your story:\n");
        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + 
                           ", who was an " + adjective2 + " " + occupation1 + 
                           " in the Kingdom of " + place + ". She loved to wear " + 
                           clothing + " and had a hobby to play " + hobby + ". She wanted to marry the " + 
                           adjective3 + " " + occupation2 + " named " + boysName + 
                           " but her father, King " + mansName + " forbid her from seeing him.");
        
        scanner.close(); // It is not the Scanner, but is what I named the variable for the Scanner object. This line closes the scanner to free up system resources.
    }
}
// Complile with javac Proj2_2_MadLibsClone.java - just run it on terminal as it is.
// Excetute the proogram with java Proj2_2_MadLibsClone