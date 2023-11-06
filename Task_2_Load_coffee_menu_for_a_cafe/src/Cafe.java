import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//2.c I have created another class called Cafe.
// Called it 'coffeeMenu' of type ArrayList<String>.
public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();
    // 2.c Added a method loadMenuData.I use the method to load the coffees.txt.
    public void loadMenuData() {

        File file = new File("src/coffees.txt");

        // 2.d I read from the file, using a Scanner object.
        // I have used while loop with the hasNextLine() and nextLine().
        // To loop over the lines of the file and add the lines to the coffees ArrayList class.

        try {
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                String coffee = scan.nextLine();
                coffeeMenu.add(coffee);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}