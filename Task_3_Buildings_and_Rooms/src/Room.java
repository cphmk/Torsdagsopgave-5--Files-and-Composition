//3.a I have created a Room.java class with the following fields.
public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    // 3.b I have created a constructor that populates all the fields above.
    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {

        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    // 3.c I have created getter()-methods, for the fields of the Rooms class,
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
