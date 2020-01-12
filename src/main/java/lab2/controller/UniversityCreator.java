package lab2.controller;

import lab2.model.Faculty;
import lab2.model.University;

import java.util.Scanner;

public class UniversityCreator {
    private Scanner scanner;
    public UniversityCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public University createUniversity() {
        University university = new University(getUniversityName(), getUniversityRank(), getUniversityFaculties());
        return university;
    }

    private String getUniversityName() {
        System.out.println("Input university name: ");
        return scanner.next();
    }

    private int getUniversityRank() {
        System.out.println("Enter university rank: ");
        return scanner.nextInt();
    }

    private Faculty[] getUniversityFaculties() {
        System.out.println("Enter the number of faculties at the University: ");
        int count = scanner.nextInt();
        Faculty[] faculties = new Faculty[count];
        FacultyCreator facultyCreator = new FacultyCreator(scanner);
        for (int i = 0; i < count; i++) {
            faculties[i] = facultyCreator.createFaculty();
        }
        return faculties;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
