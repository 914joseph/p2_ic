package problema1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.print("Room number: ");
            int roomNumberVar = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String checkInVar = sc.nextLine();
            checkInVar = sc.nextLine();
            LocalDate checkInDate = LocalDate.parse(checkInVar, formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            String checkOutVar = sc.nextLine();
            LocalDate checkOutDate = LocalDate.parse(checkOutVar, formatter);
            Reservation reservation = new Reservation(roomNumberVar, checkInDate, checkOutDate);
            if (reservation.getCheckIn().isAfter(reservation.getCheckOut())) {
                throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
            } else {
                System.out.println(
                        "Reservation: Room " + reservation.getRoomNumber() + " check-in: " + reservation.getCheckIn()
                                + ", checkout: " + reservation.getCheckOut() + ", " + reservation.duration()
                                + " nights");
            }

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String newCheckInVar = sc.nextLine();
            LocalDate newCheckIn = LocalDate.parse(newCheckInVar, formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            String newCheckOutVar = sc.nextLine();
            LocalDate newCheckOut = LocalDate.parse(newCheckOutVar, formatter);

            if (newCheckIn.isBefore(reservation.getCheckIn()) && newCheckOut.isBefore(reservation.getCheckOut())) {
                throw new IllegalArgumentException(
                        "Error in reservation: Reservation dates for update must be future dates");
            } else {
                if (newCheckIn.isAfter(newCheckOut)) {
                    throw new IllegalArgumentException(
                            "Error in reservation: Check-out date must be after check-in date");
                } else {
                    reservation.updateDates(newCheckIn, newCheckOut);
                    System.out.println("Reservation: Room " + reservation.getRoomNumber() + " check-in: "
                            + reservation.getCheckIn() + ", checkout: " +
                            reservation.getCheckOut() + ", " + reservation.duration() + " nights");
                }
            }
            sc.close();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
