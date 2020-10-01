/*
    Task 1) Output any string mirrored.
 */
import java.util.scanner
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Creating a Scanner Object
        String myString = scanner.nextLine(); // Readind Input
        
        //For loop
        for (int i = myString.length() - 1; i >= 0 ; i--) {
            System.out.print(myString.charAt(i));
        }

    }
}

