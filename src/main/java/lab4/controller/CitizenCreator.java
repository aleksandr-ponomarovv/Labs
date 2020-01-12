package lab4.controller;

import lab4.model.Address;
import lab4.model.Citizen;
import lab4.model.Sex;

import java.util.Scanner;

public class CitizenCreator {
    private Scanner scanner;

    public CitizenCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Citizen createCitizen() {
        Citizen citizen = new Citizen(getCitizenName(), getCitizenAge(), getCitizenSex(), getCitizenAddress());
        return citizen;
    }

    private String getCitizenName() {
        System.out.println("Input Citizen name: ");
        return scanner.next();
    }

    private int getCitizenAge() {
        System.out.println("Enter Citizen age: ");
        return scanner.nextInt();
    }

    private Sex getCitizenSex() {
        while (true) {
            System.out.println("Enter Citizen sex: ");
            int choice = scanner.nextInt();
            if (choice == Sex.MALE.getValue()) {
                return Sex.MALE;
            } else if (choice == Sex.FEMALE.getValue()) {
                return Sex.FEMALE;
            }
//            return null;
        }
    }

    private Address getCitizenAddress() {
//        System.out.println("Enter Citizen address: ");
        AddressCreator addressCreator = new AddressCreator(scanner);
//        Address address = new Address();
        return addressCreator.createAddress();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
