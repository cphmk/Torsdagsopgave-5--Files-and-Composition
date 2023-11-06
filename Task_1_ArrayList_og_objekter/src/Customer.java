//1.a  // 1.b

public class Customer {  // Har lavet en klasse, Customer, med firstName, lastName, username, id.

    private String firstName;    // Har gjort alle klassens felter private
    private String lastName;
    private String userName;
    private int id;



    // Har givet klassen en konstruktør, med kundens navn og brugernavn som parametre.
    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }
    // har Givet klassen en toString() metode, der printer kundens detaljer pænt ud.
    public String getFirstName() {  //Har tilføjet getters().
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return ("Name: " + firstName + " " + lastName + " userName: " + userName);
    }
}
