
package week7;

/**
 * Represents the appointment provided by the doctor to the patient
 */
public class Appointment {
	private String appointmentID;
	private String appointmentDate;
	private String appointmentTime;
	private Patient patient;
	private Doctor doctor;
	
	/**
	 * Constructs a Appointment Constructor
	 * @param appointmentID
	 * @param appointmentDate
	 * @param appointmentTime
	 * @param patient
	 * @param doctor
	 */
	public Appointment(String appointmentID, String appointmentDate, String appointmentTime, Patient patient, Doctor doctor) {
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.patient = patient;
		this.doctor = doctor;
	}
	
	/**
	 * Reschedules the Appointment
	 * @param newDate
	 * @param newTime
	 */
	public void rescheduleAppointment(String newDate, String newTime) {
		this.appointmentDate = newDate;
		this.appointmentTime = newTime;
	}
	
	/**
	 * Cancels the Appointment
	 */
	public void cancelAppointment() {
		System.out.println("Appointment Cancelled.");
	}
	
	/**
	 * Displays Appointment Details
	 */
	public void viewAppointmentDetails() {
		System.out.println("Appointment ID: " + appointmentID);
		System.out.println("Appintment Date: " + appointmentDate);
		System.out.println("Appointment Time: " + appointmentTime);
		System.out.println("Patient Details:");
		patient.viewPersonalDetails();
		System.out.println("Doctor Details:");
		doctor.viewPersonalDetails();
	}
	
	
}
