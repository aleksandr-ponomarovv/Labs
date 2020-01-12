package lab3.model;

import java.util.Objects;

public class Student {
    private String nameStudent;
    private int indexStudent;

    public Student(String nameStudent, int indexStudent) {
        this.nameStudent = nameStudent;
        this.indexStudent = indexStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return indexStudent == student.indexStudent &&
                nameStudent.equals(student.nameStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStudent, indexStudent);
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
