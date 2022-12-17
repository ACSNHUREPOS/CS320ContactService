package acAppointmentTets;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import acAppointment.AppointmentService;

class AppServiceTest {

	@AfterEach
	void tearDown() throws Exception {
		AppointmentService.appointments.clear();
	}

	@DisplayName("Add an Appointment")
	@Test
	void testAddUAppt() {
		String id = "0";
		String description = "Descriptive Description";
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		AppointmentService tAppt = new AppointmentService();

		assertEquals(0, AppointmentService.appointments.size());

		tAppt.addUniqueAppointment(gDate, description);

		assertTrue(AppointmentService.appointments.containsKey(id));
		assertEquals(gDate, AppointmentService.appointments.get(id).getDate());
		assertEquals(description, AppointmentService.appointments.get(id).getDescription());

	}

	@DisplayName("Add a bad Appointment w/ empty desc")
	@Test
	void testAddEmptyDesc() {
		String id = "0";
		String description = "";
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService tAppt = new AppointmentService();
			tAppt.addUniqueAppointment(gDate, description);
		});

		assertEquals("Invalid description", exception.getMessage());

	}

	@DisplayName("Add an Appointment w/ null desc")
	@Test
	void testAddNullDesc() {
		String id = "0";
		String description = null;
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService tAppt = new AppointmentService();
			tAppt.addUniqueAppointment(gDate, description);
		});

		assertEquals("Invalid description", exception.getMessage());

	}

	@DisplayName("Test delete Appt")
	@Test
	void tDAppt() {

		String id = "0";
		String description = "Descriptive Description";
		Calendar c = Calendar.getInstance();

		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.YEAR, 2029);

		Date gDate = c.getTime();

		AppointmentService tAppt = new AppointmentService();

		assertEquals(0, AppointmentService.appointments.size());

		tAppt.addUniqueAppointment(gDate, description);
		tAppt.addUniqueAppointment(gDate, description);
		tAppt.addUniqueAppointment(gDate, description);

		assertEquals(3, AppointmentService.appointments.size());

		tAppt.deleteAppointment("1");

		assertEquals(2, AppointmentService.appointments.size());
		assertFalse(AppointmentService.appointments.containsKey("1"));

		tAppt.deleteAppointment("1");
		assertEquals(2, AppointmentService.appointments.size());

	}

}