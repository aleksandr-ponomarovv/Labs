package lab2.model;

import java.util.Arrays;

public class Student {
    private String nameStudent;
    private int indexStudent;

    public Student(String nameStudent, int indexStudent) {
        this.nameStudent = nameStudent;
        this.indexStudent = indexStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getIndexStudent() {
        return indexStudent;
    }

    public void setIndexStudent(int indexStudent) {
        this.indexStudent = indexStudent;
    }


    @Override
    public String toString() {
        return "\n\t\t\t\t\t" +
                "Student name = '" + nameStudent + '\'' +
                ", Student index=" + indexStudent;
    }
}
