package lab2.controller;

import lab2.model.Group;
import lab2.model.Student;

import java.util.Scanner;

public class GroupCreator {
    private Scanner scanner;

    public GroupCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public Group createGroup(){
        Group group = new Group(getGroupName(),getGroupIndex(),getGroupFaculties());
        return group;
    }

    private String getGroupName(){
        System.out.println("Input Group name: ");
        return scanner.next();
    }

    private int getGroupIndex(){
        System.out.println("Enter Group index: ");
        return scanner.nextInt();
    }

    private Student[] getGroupFaculties(){
        System.out.println("Enter the number of Students at the Group: ");
        int count = scanner.nextInt();
        Student[] students = new Student[count];
        StudentCreator studentCreator = new StudentCreator(scanner);
        for (int i = 0; i < count; i++) {
            students[i] = studentCreator.createStudent();
        }
        return students;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
