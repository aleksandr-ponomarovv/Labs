package lab3.controller;

import lab3.model.Group;
import lab3.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupCreator {
    private Scanner scanner;

    public GroupCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public Group createGroup(){
        Group group = new Group(getGroupName(),getGroupIndex(), getGroupStudents());
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

    private List<Student> getGroupStudents(){
        System.out.println("Enter the number of Students at the Group: ");
        int count = scanner.nextInt();
        List<Student> students = new ArrayList<>();
        StudentCreator studentCreator = new StudentCreator(scanner);
        for (int i = 0; i < count; i++) {
            students.add(studentCreator.createStudent());
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
