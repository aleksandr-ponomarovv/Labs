package lab3.controller;

import lab3.model.Faculty;
import lab3.model.University;

import java.util.ArrayList;
import java.util.List;
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

    ;

    private String getUniversityName() {
        System.out.println("Input university name: ");
        return scanner.next();
    }

    private int getUniversityRank() {
        System.out.println("Enter university rank: ");
        return scanner.nextInt();
    }

    private List<Faculty> getUniversityFaculties() {
        System.out.println("Enter the number of faculties at the University: ");
        int count = scanner.nextInt();
        List<Faculty> faculties = new ArrayList();
        FacultyCreator facultyCreator = new FacultyCreator(scanner);
        for (int i = 0; i < count; i++) {
            faculties.add(facultyCreator.createFaculty());
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
