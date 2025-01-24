package CarRental;
import java.util.*;

public class Rental {
    private String rentID;
    private Date startDate;
    private Date endDate;
    private double price;

    // Constructor
    public Rental(String rentID, Date startDate, Date endDate, double price) {
        this.rentID = rentID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    // Getters and Setters
    public String getRentID() {
        return rentID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Calculate rental duration in days
    public long getRentalDuration() {
        long diff = endDate.getTime() - startDate.getTime();
        return diff / (1000 * 60 * 60 * 24); // Convert milliseconds to days
    }

    // Calculate total cost
    public double calculateTotalCost() {
        return getRentalDuration() * price;
    }

    // toString method
    @Override
    public String toString() {
        return "Rental{" +
                "rentID='" + rentID + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price per day=" + price +
                ", rental duration=" + getRentalDuration() + " days" +
                ", total cost=" + calculateTotalCost() +
                '}';
    }
}
