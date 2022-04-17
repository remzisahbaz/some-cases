package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.booking.BookId;
import com.sahabt.library.domain.booking.Booking;
import com.sahabt.library.domain.booking.IdentityNo;

public interface BookingApplication {

	Optional<Booking> addBooking(Booking Booking);
	Optional<Booking> removeBooking(Booking bookId);
	Optional<Booking> getAllBookingByIdentityNo(IdentityNo identityNo);
	Optional<Booking> getAllBooking();
	Optional<Booking> getInformationBooking(BookId bookId);
	

}
