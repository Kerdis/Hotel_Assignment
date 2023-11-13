package main.java.com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person Stephanie = new Person(24, "female", 46, 165, "Stephanie");
        Employee Jisoo = new Employee(29, "Female", 44, 161, "Jisoo", 0103, "Receptionist");
        Employee Madison = new Employee(21, "Female", 50, 170, "Madison", 0510, "Manager");
        Guest Stephen = new Guest(31, "Male", 81, 191, "Stephen");
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(Stephen);
        Hotel pitbull = new Hotel("APCSA");
        Room regular = new Room(2, 40, false);
        Room economy = new Room(2, 600, false);
        Room deluxe = new Room(2, 8000, false);
        pitbull.hireEmployee(Jisoo);
        pitbull.hireEmployee(Madison);
        deluxe.addGuest(Stephen);
        // for (Employee employee : pitbull.getEmployeeList()) {
        //     System.out.println(employee.getName());
        // }
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(economy);
        rooms.add(regular);
        rooms.add(deluxe);
        pitbull.setRoomList(rooms);
        //System.out.println(pitbull.book(guests, 80000));
        for (Room room : pitbull.getRoomList()) {
            for (Guest guest : room.getGuests()){
                System.out.println(guest.getName());
            }
        }
    }
}