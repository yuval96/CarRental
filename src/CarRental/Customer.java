package CarRental;
import java.util.*;

public class Customer {
    private String cusID;
    private String licenseNumber;
    private String fName;
    private String surName;
    private String address;
    private Date dateOfBirth;
    private String nationality;      // Nationality as a string
    private List<Phone> phones;      // List of phone numbers
    private List<Rental> rentals;    // List of rentals for this customer

    // Constructor
    public Customer(String cusID, String licenseNumber, String fName, String surName, 
                    String address, Date dateOfBirth, String nationality) {
        this.cusID = cusID;
        this.licenseNumber = licenseNumber;
        this.fName = fName;
        this.surName = surName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.phones = new ArrayList<>();
        this.rentals = new ArrayList<>();
    }

    // Getters and Setters
    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void addPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void removePhone(Phone phone) {
        this.phones.remove(phone);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public void removeRental(Rental rental) {
        this.rentals.remove(rental);
    }

    // Calculate customer's age
    public int calculateAge() {
        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);

        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    // toString Method
    @Override
    public String toString() {
        return "Customer{" +
                "cusID='" + cusID + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", fName='" + fName + '\'' +
                ", surName='" + surName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nationality='" + nationality + '\'' +
                ", phones=" + phones +
                ", rentals=" + rentals +
                ", age=" + calculateAge() +
                '}';
    }
}
