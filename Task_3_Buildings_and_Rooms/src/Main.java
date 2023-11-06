import java.util.ArrayList;


public class Main {

//3.g I have instantiated at least three different rooms, in my main method.
//3.h I have added three rooms to a collection.

    // 3.i I have instantiated a new building, in my main method.
    public static Building buildings1;

    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room(4,12,4));
        rooms.add(new Room(5,8,5));
        rooms.add(new Room(3,4,2));
        buildings1 = new Building(rooms,8,4,true);

        System.out.println(countLampsInBuilding(buildings1));
        System.out.println(isNormal(buildings1));
    }

    // 3.j I have created a static method in Main, called countLampsInBuilding.
    // It takes an object, and returns the total number of lamps.
    public static int countLampsInBuilding(Building building) {

        int lampsInBuilding = 0;

        for(int i = 0; i < building.getRooms().size(); i++) {
            int LampsInRoom = building.getRooms().get(i).getNumberOfLamps();
            lampsInBuilding += LampsInRoom;
        }
        return lampsInBuilding;
    }
// 3.k I have created another static method in Main, called isNormal,
// The method returns true, if the Building's numberOfFloors
// is greater than its number of Rooms.
// If not it should print "This is an odd building" and return false.
    public static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();
        if(numberOfFloors > numberOfRooms) {
            return true;
        }
        else {
            System.out.println("This is a strange building");
            return false;
        }
    }
}
