package lab4.model;

public class Address {
    private String city;
    private String street;
    private int build;
    private int apart;

    public Address(String city, String street, int build, int apart) {
        this.city = city;
        this.street = street;
        this.build = build;
        this.apart = apart;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }

    public int getApart() {
        return apart;
    }

    public void setApart(int apart) {
        this.apart = apart;
    }
}
