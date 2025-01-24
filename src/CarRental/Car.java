package CarRental;
import java.util.*;

public class Car {
    private String plateNum;
    private String brand;
    private Boolean isRented; // true = rented, false = available for rent
    private Date productionYear;
    private double pricePerDay;
    private double kilometrage;
    private List<Maintenance> maintenanceHistory; // Maintenance records
    private CarInMaintenance inMaintenance; // Represents the current maintenance status

    // Constructor
    public Car(String plateNum, String brand, Boolean isRented, Date productionYear, double pricePerDay, double kilometrage) {
        this.plateNum = plateNum;
        this.brand = brand;
        this.isRented = isRented;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
        this.kilometrage = kilometrage;
        this.maintenanceHistory = new ArrayList<>();
        this.inMaintenance = new CarInMaintenance(true, plateNum); // Default to available for maintenance
    }

    // Getters and Setters
    public String getPlateNum() {
        return plateNum;
    }

    public String getBrand() {
        return brand;
    }

    public Boolean isAvailable() {
        // Available only if not rented and not under maintenance
        return !isRented && inMaintenance.isAvailable();
    }

    public void setRented(Boolean isRented) {
        this.isRented = isRented;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void addKilometers(double kilometers) {
        if (kilometers < 0) {
            throw new IllegalArgumentException("Kilometers must be positive.");
        }
        this.kilometrage += kilometers;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        if (pricePerDay < 0) {
            throw new IllegalArgumentException("Price per day cannot be negative.");
        }
        this.pricePerDay = pricePerDay;
    }

    public List<Maintenance> getMaintenanceHistory() {
        return maintenanceHistory;
    }

    public void addMaintenance(Maintenance maintenance) {
        this.maintenanceHistory.add(maintenance);
        this.inMaintenance.setStatus(false); // Mark as under maintenance
    }

    public void completeMaintenance() {
        this.inMaintenance.setStatus(true); // Mark as available for use after maintenance
    }

    public CarInMaintenance getInMaintenance() {
        return inMaintenance;
    }
    
    // toString Method
    @Override
    public String toString() {
        return "Car{" +
                "plateNum='" + plateNum + '\'' +
                ", brand='" + brand + '\'' +
                ", isRented=" + (isRented ? "Rented" : "Available") +
                ", productionYear=" + productionYear +
                ", pricePerDay=" + pricePerDay +
                ", kilometrage=" + kilometrage +
                ", inMaintenance=" + inMaintenance +
                ", maintenanceHistory=" + maintenanceHistory +
                '}';
    }
}
