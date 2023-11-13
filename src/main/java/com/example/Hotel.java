package main.java.com.example;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomlist;
    private String name;
    private ArrayList<Employee> employeeList;

    public Hotel(String name) {
        this.name = name;
        this.roomlist = new ArrayList<Room>();
        this.employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Room> getRoomList() {
        return this.roomlist;
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setRoomList(ArrayList<Room> roomlist) {
        this.roomlist = roomlist;
    }

    public void hireEmployee(Employee employee) {
        this.employeeList.add(employee);
    }

    public void fireEmployee(Employee employee) {
        this.employeeList.remove(employee);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean book(ArrayList<Guest> guests, double budget) {
        ArrayList<Room> available = new ArrayList<Room>();
        for (Room room : this.roomlist) {
            if (room.getOccupied() == false) {
                available.add(room);
            }
        }
        for (int i = 0; i < available.size(); i++) {
            for (int j = 0; j < available.size() - 1 - i; j++) {
                if (available.get(j).getPrice() > available.get(j + 1).getPrice()) {
                    Room temp = available.get(j);
                    available.set(j, available.get(j + 1));
                    available.set(j + 1, temp);
                }
            }
        }
        ArrayList<Room> roomsForBooking = new ArrayList<Room>();
        int counter = 0;
        for (Room room : available) {
            if (counter >= guests.size()) {
                break;
            }
            roomsForBooking.add(room);
            counter += room.getOccupancy();
        }
        if (counter < guests.size()) {
            return false;
        }

        double roomPrice = 0;
        for (Room room : roomsForBooking) {
            if (room.getPrice() <= roomPrice) {
                break;
            }
            roomPrice = roomPrice + room.getPrice();
        }
        if (budget < roomPrice) {
            return false;
        }

        for (Room room : roomsForBooking) {
            room.setOccupied(true);
            int occupancy = room.getOccupancy();
            for (int i = 0; i < occupancy; i++) {
                if (i < guests.size()) {
                    room.addGuest(guests.get(i));
                    guests.remove(i);
                }
            }
        }

        return true;

    }

}