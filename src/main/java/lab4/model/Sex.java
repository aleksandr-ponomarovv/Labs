package lab4.model;

public enum Sex {
    MALE(1, "man", "мужик", "чоловік"),
    FEMALE(2, "woman", "женщина", "жінка");

    private int value;
    private String engName;
    private String rusName;
    private String ukrName;

    Sex(int value, String engName, String rusName, String ukrName) {
        this.value = value;
        this.engName = engName;
        this.rusName = rusName;
        this.ukrName = ukrName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }

    public String getUkrName() {
        return ukrName;
    }

    public void setUkrName(String ukrName) {
        this.ukrName = ukrName;
    }
}
