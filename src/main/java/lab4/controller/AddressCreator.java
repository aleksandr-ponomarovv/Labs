package lab4.controller;

import lab4.model.Address;
import lab4.model.Citizen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AddressCreator {
    private Scanner scanner;

    public AddressCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Address createAddress() {
//        getAddressCitizen(),
        Address address = new Address(getAddressCity(), getAddressStreet(), getAddressBuild(), getAddressApart());
        return address;
    }

    private List<Citizen> getAddressCitizen() {
        System.out.println("Enter the number of Address at the Citizen: ");
        int count = scanner.nextInt();
        ArrayList<Citizen> citizens = new ArrayList<>();
        CitizenCreator citizenCreator = new CitizenCreator(scanner);

        IntStream.of(1, count).forEach(iterator -> citizens.add(citizenCreator.createCitizen()));

//        Stream.collect(
//                () -> new ArrayList<String>(), // создаем ArrayList
//                (list, item) -> list.add(item)); // добавляем в список элемент
        return citizens;
    }

    private String getAddressCity() {
        System.out.println("Input Address city: ");
        return scanner.next();
    }

    private String getAddressStreet() {
        System.out.println("Input Address street: ");
        return scanner.next();
    }

    private int getAddressBuild() {
        System.out.println("Enter Address build: ");
        return scanner.nextInt();
    }

    private int getAddressApart() {
        System.out.println("Enter Address apart: ");
        return scanner.nextInt();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
