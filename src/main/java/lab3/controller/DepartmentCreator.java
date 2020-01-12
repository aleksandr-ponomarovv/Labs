package lab3.controller;

import lab3.model.Department;
import lab3.model.Group;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentCreator {
    private Scanner scanner;

    public DepartmentCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public Department createDepartment(){
        Department department = new Department(getDepartmentName(),getDepartmentIndex(), getDepartmentGroups());
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

    private List<Group> getDepartmentGroups(){
        System.out.println("Enter the number of Groups at the Department: ");
        int count = scanner.nextInt();
        List<Group> groups = new ArrayList<>();
        GroupCreator groupCreator = new GroupCreator(scanner);
        for (int i = 0; i < count; i++) {
            groups.add(groupCreator.createGroup());
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
