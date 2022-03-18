package com.garagem.models;

import java.util.ArrayList;
import java.util.List;

public class Garagem {

    int id;
    List<Vehicle> vehicles = new ArrayList<>();

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public List<Vehicle> getVehicles() { return vehicles; }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

}
