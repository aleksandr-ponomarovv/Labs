package lab3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Faculty {
    private String nameFaculty;
    private int numberFaculty;
    private List<Department> departments;

    public Faculty(String nameFaculty, int numberFaculty, List<Department> departments) {
        this.nameFaculty = nameFaculty;
        this.numberFaculty = numberFaculty;
        this.departments = departments;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public int getNumberFaculty() {
        return numberFaculty;
    }

    public void setNumberFaculty(int numberFaculty) {
        this.numberFaculty = numberFaculty;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "\n\t\t" +
                "Faculty name = '" + nameFaculty + '\'' +
                ", number = " + numberFaculty + ", \n\n\t\t" +
                "departments = " + departments;// + "\n \t\t\t";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return numberFaculty == faculty.numberFaculty &&
                Objects.equals(nameFaculty, faculty.nameFaculty) &&
                Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFaculty, numberFaculty, departments);
    }
}
