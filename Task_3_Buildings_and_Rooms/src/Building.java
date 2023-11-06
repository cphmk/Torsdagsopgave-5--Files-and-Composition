import java.util.ArrayList;
// 3.d I have Created a Building.java class with the following fields.
public class Building {
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    private ArrayList<Room> rooms = new ArrayList<>();

    //3.e I have created a constructor, that populates all the fields above.

    Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
    // 3.f I have created getters() for the fields of the Building class.
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean getIsOfficeBuilding() {
        return isOfficeBuilding;
    }
}
