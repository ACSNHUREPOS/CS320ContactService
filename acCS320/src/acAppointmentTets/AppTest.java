package acAppointmentTets;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.Test;

import acAppointment.Appointment;

class AppTest {

	@DisplayName("Test....")
	@Test
	void testAppointment() {
		String id = "1";
		Calendar c = Calendar.getInstance();
		String description = "Discriptive Description ";

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		Appointment tAppt = new Appointment(id, gDate, description);

		assertEquals(1, tAppt.getUniqueID());
		assertEquals(gDate, tAppt.getDate());
		assertEquals(description, tAppt.getDescription());

	}

	@DisplayName("Test id too long")
	@Test
	void testBadAppointment() {
		String id = "1234567891000000000";
		Date date = new Date();
		String description = "Descriptve Description";

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, date, description);
		});

		assertEquals("Invalid ID", exception.getMessage());

	}

	@DisplayName("Test id null")
	@Test
	void testBadIDNull() {
		String id = null;
		Date date = new Date();
		String description = "Descriptive Description";

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, date, description);
		});

		assertEquals("Invalid ID", exception.getMessage());

	}

	@DisplayName("Test ..... past date")
	@Test
	void testBadDate() {
		String id = "1";
		Calendar c = Calendar.getInstance();
		String description = "This is a good description";

		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DATE, 10);
		c.set(Calendar.YEAR, 1990);

		Date bDate = c.getTime();

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, bDate, description);
		});

		assertEquals("Invalid date", exception.getMessage());

	}

	@DisplayName("Test ..... null date")
	@Test
	void testNullDate() {
		String id = "1";
		String description = "Descriptive Descripion";
		Date bDate = null;

		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		Appointment tAppt = new Appointment(id, gDate, description);

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, bDate, description);
		});

		assertEquals("Invalid date", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> {
			tAppt.setDate(null);
		});

		assertEquals("Invalid date", exception.getMessage());
	}

	@DisplayName("Test bad decription too long")
	@Test
	void testLongDesc() {
		String id = "1";
		String description = "Descriptive Description is too LONG..... Descriptive Description is too LONG..... Descriptive Description is too LONG..... Descriptive Description is too LONG.....";
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		Appointment tempAppt = new Appointment(id, gDate, "test");

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, gDate, description);
		});

		assertEquals("Invalid description", exception.getMessage());

		exception = assertThrows(IllegalArgumentException.class, () -> {
			tempAppt.setDescription(description);
		});

		assertEquals("Invalid description", exception.getMessage());
	}

	@DisplayName("Test bad decription null")
	@Test
	void testNullDesc() {
		String id = "1";
		String description = null;
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, gDate, description);
		});

		assertEquals("Invalid description", exception.getMessage());
	}

	@DisplayName("Test Empty description")
	@Test
	void tNDescrrription() {
		String id = "1";
		String description = "";
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(id, gDate, description);
		});

		assertEquals("Invalid description", exception.getMessage());
	}

}