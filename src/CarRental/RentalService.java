package CarRental;

import java.util.*;

public class RentalService {

    public static Rental orderRental(Car car, Date startDate, Date endDate) {
        // Validate rental dates
        if (startDate.after(endDate)) {
            System.out.println("Error: Start date must be before end date.");
            return null;
        }

        // Check if the car is available
        if (!car.isAvailable()) {
            System.out.println("Car " + car.getPlateNum() + " is not available for rental.");
            return null;
        }

        // Calculate the rental duration in days
        long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
        long duration = diffInMillies / (1000 * 60 * 60 * 24); // Convert to days

        // Ensure duration is at least 1 day
        if (duration == 0) {
            duration = 1;
        }

        // Calculate total price
        double totalPrice = duration * car.getPricePerDay();

        // Create a rental
        Rental rental = new Rental(UUID.randomUUID().toString(), startDate, endDate, totalPrice);

        // Update car status
        car.setRented(true); // Mark the car as rented

        System.out.println("Rental successfully created for car: " + car.getPlateNum());
        System.out.println("Total price: $" + totalPrice);
        return rental;
    }
}
