package com.teachmeskills.lesson5.task4;

import java.util.Arrays;

public class Home {
    private int floors;
    private int entrance;
    private Flat[] flats;
    private String address;

    public Home(int floors, int entrance, Flat[] flats, String address) {
        if (floors <= 0) {
            throw new RuntimeException("Floors should be > 0");
        }
        if (entrance <= 0) {
            throw new RuntimeException("Entrance should be > 0");
        }

        this.floors = floors;
        this.entrance = entrance;

        for (Flat flat : flats) {
            validateFlat(flat);
        }
        this.flats = flats;
        this.address = address;
    }

    public void addFlat(Flat flat) {
        validateFlat(flat);

        flats = Arrays.copyOf(flats, flats.length + 1);
        flats[flats.length - 1] = flat;
    }

    public void changeOwner(int flatNumber, String owner) {
        for (Flat flat : flats) {
            if (flat.getFlatNumber() == flatNumber) {
                flat.setOwner(owner);
                System.out.println(flat);
            }
        }
    }

    private void validateFlat(Flat flat) {
        if (flat.getEntranceNumber() > entrance || flat.getFloorNumber() > floors) {
            throw new RuntimeException("Incorrect flat = " + flat.getFlatNumber());
        }
    }

    @Override
    public String toString() {
        return "Home{" +
                "floors=" + floors +
                ", entrance=" + entrance +
                ", flats=" + Arrays.toString(flats) +
                ", address='" + address + '\'' +
                '}';
    }
}
