package objects_classes_methods.labs;

import java.util.ArrayList;

/**
 * Objects, Classes and Methods Exercise 1:
 * <p>
 * Create three classes, all of which can be inside this file. The first class (the controller)
 * should have the main method. The main method should create at least two objects using the
 * constructors of the second and third class. The second and third class should each have at least
 * three instance variables that should be set using the constructor when an object is created.
 * <p>
 * Once the objects are created, try changing the values of some of the instance variables.
 * <p>
 * Think about some of the examples we have seen from the lectures or Confluence Docs.
 * <p>
 * Be creative. Have some fun. Using Java objects you can model just about anything you want.
 * Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

class Example{
    public static void main(String[] args) {
        Hotel hilton = new Hotel();
        hilton.name = "Hilton";

        HotelActivities activities = new HotelActivities();
        activities.setGym("Hilton Gym");
        activities.setJacuzzi("Hilton Jacuzzi");
        activities.setDanceFloor("Hilton Dancefloor");
        hilton.activities = activities;


        Room room1 = new Room();
        room1.setNumber(5);
        room1.setBeds(2);
        room1.setMiniBars(true);

        hilton.rooms.add(room1);

        Room room2 = new Room();
        room2.setNumber(15);
        room2.setBeds(2);
        room2.setMiniBars(true);

        hilton.rooms.add(room2);
        System.out.println(hilton.toString());
    }
}

class Hotel {

    ArrayList<Room> rooms = new ArrayList<>();
    HotelActivities activities;
    String name;

    @Override
    public String toString() {
        String roominfo ="";
        for(Room r : rooms){
            roominfo = roominfo + r.toString();
        }
        return "Hotel{" +
                "rooms=" + roominfo +
                ", activities=" + activities.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}

class Room {
    private int number;
    private int beds;
    private boolean miniBars;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean getMiniBars() {
        return miniBars;
    }

    public void setMiniBars(boolean miniBars) {
        this.miniBars = miniBars;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", beds=" + beds +
                ", miniBars=" + miniBars +
                '}';
    }
}

class HotelActivities {
    private String gym;
    private String jacuzzi;
    private String danceFloor;

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(String jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getDanceFloor() {
        return danceFloor;
    }

    public void setDanceFloor(String danceFloor) {
        this.danceFloor = danceFloor;
    }

    @Override
    public String toString() {
        return "HotelActivities{" +
                "gym='" + gym + '\'' +
                ", jacuzzi='" + jacuzzi + '\'' +
                ", danceFloor='" + danceFloor + '\'' +
                '}';
    }
}

