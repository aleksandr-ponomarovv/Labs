package lab3.model;

import java.util.Arrays;

public class Faculty {
    private String nameFaculty;
    private int numberFaculty;
    private Department[] departments;

    public Faculty(String nameFaculty, int numberFaculty, Department[] departments) {
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

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "\n\t\t" +
                "Faculty name = '" + nameFaculty + '\'' +
                ", number = " + numberFaculty + ", \n\n\t\t" +
                "departments = " + Arrays.toString(departments);// + "\n \t\t\t";
    }
}
