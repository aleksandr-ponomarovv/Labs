package lab2.controller;

import lab2.model.Student;

import java.util.Scanner;

public class StudentCreator {
    private Scanner scanner;

    public StudentCreator(Scanner scanner) {
        this.setScanner(scanner);
    }

    public Student createStudent(){
        Student student = new Student(getStudentName(),getStudentIndex());
        return student;
    }

    private String getStudentName(){
        System.out.println("Input Student name: ");
        return scanner.next();
    }

    private int getStudentIndex(){
        System.out.println("Enter Student index: ");
        return scanner.nextInt();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
