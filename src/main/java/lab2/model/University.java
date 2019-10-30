package lab2.model;

import java.util.Arrays;
import java.util.Objects;

public class University {
    private String nameUniversity;
    private int rankUniversity;
    private Faculty[] faculties;

    public University(String nameUniversity, int indexUniversity, Faculty[] departments) {
        this.nameUniversity = nameUniversity;
        this.rankUniversity = indexUniversity;
        this.faculties = departments;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public int getRankUniversity() {
        return rankUniversity;
    }

    public void setRankUniversity(int indexUniversity) {
        this.rankUniversity = indexUniversity;
    }

    public Faculty[] getDepartments() {
        return faculties;
    }

    public void setDepartments(Faculty[] departments) {
        this.faculties = departments;
    }

//    @Override
//    public String toString() {
//        return "University{" +
//                "nameUniversity='" + nameUniversity + '\'' +
//                ", rankUniversity=" + rankUniversity +
//                ", faculties=" + Arrays.toString(faculties) +//faculties.toString() + //Arrays.toString(faculties) +
//                '}';
//    }


    @Override
    public String toString() {
        return "University have: \n\t" +
                "name = '" + nameUniversity + '\'' +
                ", rank = " + rankUniversity + ", \n\n\t" +
                "faculties = " + Arrays.toString(faculties);// + "\n \t\t\t";
    }
}
