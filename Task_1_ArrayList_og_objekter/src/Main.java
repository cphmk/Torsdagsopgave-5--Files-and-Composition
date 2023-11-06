
import java.util.ArrayList;

//1.c
// Jeg har lavet en Main klasse med en main metode, og har oprettet en ArrayList,'customers'.
//1.d


// Jeg har testet metoden fra main, ved at kalde den med min ArrayList, som argument.

public class Main {
    //Jeg har lavet en static metode i Main kaldet printCustomers(ArrayList customers),
    // Jeg har printet alle kunderne ud, ved at gennemløbe 'customers' med et ’for each’ loop.

    public static void printCustomers (ArrayList<Object> customers ) {
        for(Object Customer : customers) {

            System.out.println(Customer);
        }
    }

    public static void main(String[] args) {

        ArrayList<Object> customers = new ArrayList<>();

        Customer customers1 = new Customer("Mahdi", "Karimi", "681");

        customers.add(customers1);

        Customer customers2 = new Customer("Claus", "Jørgensen", "666");

        customers.add(customers2);

        Customer customers3 = new Customer("Mike", "Tyson", "112");

        customers.add(customers3);
        printCustomers(customers);
    }
}