package lab3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Group {
    private String nameGroup;
    private int indexGroup;
    private List<Student> students;

    public Group(String nameGroup, int indexGroup, List<Student> students) {
        this.nameGroup = nameGroup;
        this.indexGroup = indexGroup;
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return indexGroup == group.indexGroup &&
                nameGroup.equals(group.nameGroup) &&
                students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameGroup, indexGroup, students);
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t" +
                "Group name = '" + nameGroup + '\'' +
                ", Group index = " + indexGroup + ", \n\n\t\t\t\t" +
                "students = " + students;// + "\n \t\t\t";
    }
}
