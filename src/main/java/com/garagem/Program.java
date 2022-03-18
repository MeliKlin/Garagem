package com.garagem;

import com.garagem.models.Garagem;
import com.garagem.models.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {
        Garagem garagem = new Garagem();

        garagem.addVehicle(new Vehicle("Ford", "Fiesta", BigDecimal.valueOf(1000)));
        garagem.addVehicle(new Vehicle("Ford", "Focus", BigDecimal.valueOf(1200)));
        garagem.addVehicle(new Vehicle("Ford", "Explorer", BigDecimal.valueOf(2500)));
        garagem.addVehicle(new Vehicle("Fiat", "Uno", BigDecimal.valueOf(500)));
        garagem.addVehicle(new Vehicle("Fiat", "Cronos", BigDecimal.valueOf(1000)));
        garagem.addVehicle(new Vehicle("Fiat", "Torino", BigDecimal.valueOf(1250)));
        garagem.addVehicle(new Vehicle("Chevrolet", "Aveo", BigDecimal.valueOf(1250)));
        garagem.addVehicle(new Vehicle("Chevrolet", "Spin", BigDecimal.valueOf(2500)));
        garagem.addVehicle(new Vehicle("Toyota", "Corola", BigDecimal.valueOf(1200)));
        garagem.addVehicle(new Vehicle("Toyota", "Fortuner", BigDecimal.valueOf(3000)));
        garagem.addVehicle(new Vehicle("Renault", "Logan", BigDecimal.valueOf(950)));

        List<Vehicle> ordered = garagem.getVehicles().stream().sorted((a, b) -> a.getPrice().compareTo(b.getPrice())).collect(Collectors.toList());

        System.out.println("Ordenado por preço: ");
        for (Vehicle vehicle: ordered) {
            System.out.println(vehicle);
        }

        List<Vehicle> orderedByBrand = garagem.getVehicles().stream().sorted((a, b) -> a.getBrand().compareTo(b.getBrand())).collect(Collectors.toList());
        System.out.println("\nOrdenado por marca: ");
        orderedByBrand.forEach(System.out::println);

        List<Vehicle> lessThanThousand = garagem.getVehicles().stream().filter(v -> v.getPrice().compareTo(BigDecimal.valueOf(1000)) < 0).collect(Collectors.toList());
        System.out.println("\n Menores que 1000: ");
        lessThanThousand.forEach(System.out::println);

        List<Vehicle> greaterOrEqualThousand = garagem.getVehicles().stream().filter(v -> v.getPrice().compareTo(BigDecimal.valueOf(1000)) > 0).collect(Collectors.toList());
        System.out.println("\n Maiores ou iguais a 1000: ");
        greaterOrEqualThousand.forEach(System.out::println);
    }

}
