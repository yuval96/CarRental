package CarRental;

// Represents a car in service for maintenance
public class CarInMaintenance {
    private Boolean status; // true = available, false = under maintenance
    private String plateNum; // License plate number of the car

    // Constructor
    public CarInMaintenance(Boolean status, String plateNum) {
        this.plateNum = plateNum;
        this.status = status;
    }

    // Check availability
    public Boolean isAvailable() {
        return status;
    }

    // Get the plate number
    public String getPlateNum() {
        return plateNum;
    }

    // Update status
    public void setStatus(Boolean status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "CarInMaintenance{" +
                "status=" + (status ? "Available" : "Under Maintenance") +
                ", plateNum='" + plateNum + '\'' +
                '}';
    }
}
