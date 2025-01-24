package CarRental;

public class Phone {
    private String countryCode; // e.g., "+1", "+972"
    private String areaCode;    // e.g., "212", "3"
    private String number;      // e.g., "5551234"

    // Constructor
    public Phone(String countryCode, String areaCode, String number) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
    }

    // Getters and Setters
    public String getCountryCode() {
        return countryCode;
    }

    
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Full phone number in international format
    public String getFullNumber() {
        return countryCode + "-" + areaCode + "-" + number;
    }

    // Override toString
    @Override
    public String toString() {
        return "Phone{" +
                "countryCode='" + countryCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", number='" + number + '\'' +
                ", fullNumber='" + getFullNumber() + '\'' +
                '}';
    }
}
