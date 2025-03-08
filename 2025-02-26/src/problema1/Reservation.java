package problema1;

import java.time.LocalDate;

public class Reservation {

    private int roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    Reservation(int roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    int duration() {
        LocalDate duracao = checkOut.minusDays(checkIn.getDayOfMonth());
        return duracao.getDayOfMonth();
    }

    void updateDates(LocalDate checkIn, LocalDate checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    int getRoomNumber() {
        return roomNumber;
    }

    LocalDate getCheckIn() {
        return checkIn;
    }

    LocalDate getCheckOut() {
        return checkOut;
    }

}
