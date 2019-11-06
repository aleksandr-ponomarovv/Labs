package lab3.controller;

import lab3.model.Department;
import lab3.model.Group;

import java.util.Scanner;

public class DepartmentCreator {
    private Scanner scanner;

    public DepartmentCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public Department createDepartment(){
        Department department = new Department(getDepartmentName(),getDepartmentIndex(),getDepartmentFaculties());
        return department;
    }

    private String getDepartmentName(){
        System.out.println("Input Department name: ");
        return scanner.next();
    }

    private int getDepartmentIndex(){
        System.out.println("Enter Department index: ");
        return scanner.nextInt();
    }

    private Group[] getDepartmentFaculties(){
        System.out.println("Enter the number of Groups at the Department: ");
        int count = scanner.nextInt();
        Group[] groups = new Group[count];
        GroupCreator groupCreator = new GroupCreator(scanner);
        for (int i = 0; i < count; i++) {
            groups[i] = groupCreator.createGroup();
        }
        return groups;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
