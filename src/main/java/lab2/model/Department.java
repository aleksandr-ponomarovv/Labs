package lab2.model;

import java.util.Arrays;

public class Department {
    private String nameDepartment;
    private int indexDepartment;
    private Group[] groups;

    public Department(String nameDepartment, int indexDepartment, Group[] groups) {
        this.nameDepartment = nameDepartment;
        this.indexDepartment = indexDepartment;
        this.groups = groups;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getIndexDepartment() {
        return indexDepartment;
    }

    public void setIndexDepartment(int indexDepartment) {
        this.indexDepartment = indexDepartment;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "\n\t\t\t" +
                "Department name = '" + nameDepartment + '\'' +
                ", Department index = " + indexDepartment + ", \n\n\t\t\t" +
                "groups = " + Arrays.toString(groups);
    }
}
