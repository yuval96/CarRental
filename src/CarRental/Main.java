package CarRental;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a car
        Car car = new Car("123-456-78", "Toyota", false, new Date(2020 - 1900, 5, 15), 100.0, 25000.0);

        // Define rental dates
        Date startDate = new Date(2025 - 1900, 0, 1); // Jan 1, 2025
        Date endDate = new Date(2025 - 1900, 0, 5);   // Jan 5, 2025

        // Order a rental
        Rental rental = RentalService.orderRental(car, startDate, endDate);

        // Check rental details
        if (rental != null) {
            System.out.println(rental);
        }

        // Try to rent the car again while it’s already rented
        System.out.println("\nAttempting to rent the same car again:");
        Rental rental2 = RentalService.orderRental(car, startDate, endDate);

        // Complete maintenance and rent again
        System.out.println("\nCompleting maintenance and renting again:");
        car.completeMaintenance();
        car.setRented(false);
        Rental rental3 = RentalService.orderRental(car, startDate, endDate);

        if (rental3 != null) {
            System.out.println(rental3);
        }
    }
}

