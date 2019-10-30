package lab2.controller;

import lab2.model.Department;
import lab2.model.Faculty;

import java.util.Scanner;

public class FacultyCreator {
    private Scanner scanner;

    public FacultyCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public Faculty createFaculty(){
        Faculty faculty = new Faculty(getFacultyName(),getFacultyNumber(),getFacultyFaculties());
        return faculty;
    }

    private String getFacultyName(){
        System.out.println("Input Faculty name: ");
        return scanner.next();
    }

    private int getFacultyNumber(){
        System.out.println("Enter Faculty number: ");
        return scanner.nextInt();
    }

    private Department[] getFacultyFaculties(){
        System.out.println("Enter the number of departments at the Faculty: ");
        int count = scanner.nextInt();
        Department[] departments = new Department[count];
        DepartmentCreator departmentCreator = new DepartmentCreator(scanner);
        for (int i = 0; i < count; i++) {
            departments[i] = departmentCreator.createDepartment();
        }
        return departments;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
