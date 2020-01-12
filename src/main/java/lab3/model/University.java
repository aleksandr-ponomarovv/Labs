package lab3.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private String nameUniversity;
    private int rankUniversity;
    private List<Faculty> faculties;

    public University(String nameUniversity, int indexUniversity, List<Faculty> faculties) {
        this.nameUniversity = nameUniversity;
        this.rankUniversity = indexUniversity;
        this.faculties = faculties;
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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University have: \n\t" +
                "name = '" + nameUniversity + '\'' +
                ", rank = " + rankUniversity + ", \n\n\t" +
                "faculties = " + faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return rankUniversity == that.rankUniversity &&
                nameUniversity.equals(that.nameUniversity) &&
                faculties.equals(that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameUniversity, rankUniversity, faculties);
    }
}
