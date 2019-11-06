package lab3.model;

import java.util.Arrays;

public class Group {
    private String nameGroup;
    private int indexGroup;
    private Student[] students;

    public Group(String nameGroup, int indexGroup, Student[] students) {
        this.nameGroup = nameGroup;
        this.indexGroup = indexGroup;
        this.students = students;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getIndexGroup() {
        return indexGroup;
    }

    public void setIndexGroup(int indexGroup) {
        this.indexGroup = indexGroup;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t" +
                "Group name = '" + nameGroup + '\'' +
                ", Group index = " + indexGroup + ", \n\n\t\t\t\t" +
                "students = " + Arrays.toString(students);// + "\n \t\t\t";
    }
}
