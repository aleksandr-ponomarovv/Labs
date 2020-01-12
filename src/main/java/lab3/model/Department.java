package lab3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Department {
    private String nameDepartment;
    private int indexDepartment;
    private List<Group> groups;

    public Department(String nameDepartment, int indexDepartment, List groups) {
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

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return indexDepartment == that.indexDepartment &&
                nameDepartment.equals(that.nameDepartment) &&
                groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDepartment, indexDepartment, groups);
    }

    @Override
    public String toString() {
        return "\n\t\t\t" +
                "Department name = '" + nameDepartment + '\'' +
                ", Department index = " + indexDepartment + ", \n\n\t\t\t" +
                "groups = " + groups;
    }
}
