package CarRental;
import java.util.*;

public class Maintenance {
    private final String mID;     // Maintenance ID (unique and immutable)
    private Date startDate;       // Start date of maintenance
    private Date endDate;         // End date of maintenance
    private double cost;          // Cost of maintenance
    private String maintenanceType; // Type of maintenance (e.g., Repair, Routine Check)

    // Constructor
    public Maintenance(String mID, Date startDate, Date endDate, double cost, String maintenanceType) {
        this.mID = mID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.maintenanceType = maintenanceType;
    }

    // Getter for mID (no setter since it's final)
    public String getMID() {
        return mID;
    }

    // Getters and Setters for other fields
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    // Calculate maintenance duration in days
    public long getMaintenanceDuration() {
        long diff = endDate.getTime() - startDate.getTime();
        return diff / (1000 * 60 * 60 * 24); // Convert milliseconds to days
    }

    // toString Method
    @Override
    public String toString() {
        return "Maintenance{" +
                "mID='" + mID + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", cost=" + cost +
                ", maintenanceType='" + maintenanceType + '\'' +
                ", duration=" + getMaintenanceDuration() + " days" +
                '}';
    }
}
