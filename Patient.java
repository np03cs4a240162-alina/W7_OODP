
package week7;

/**
 * Represents a patient in the hospital
 */
public class Patient extends Person{
	private String patientID;
	
	/**
	 * Constructs the Patient Constructor
	 * @param personID
	 * @param name
	 * @param age
	 * @param gender
	 * @param address
	 * @param contactDetails
	 * @param patientID
	 */
	public Patient(String personID, String name, int age, String gender, String address, String contactDetails, String patientID) {
		super(personID, name, age, gender, address, contactDetails);
		this.patientID = patientID;
	}
	
	/**
	 * Books an appointment with the Doctor
	 * @param doctor
	 * @param date
	 * @param time
	 * @return
	 */
	public Appointment bookAppointment(Doctor doctor, String date, String time) {
		return new Appointment("A001", date, time, this, doctor);
	}

	public String getPatientID() {
		return patientID;
	}	
	
}