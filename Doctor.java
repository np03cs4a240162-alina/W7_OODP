package week7;

public class Doctor extends Person{
	private String doctorID;
	private String department;
	
	/**
	 * Constructs Doctor Constructor
	 * @param personID
	 * @param name
	 * @param age
	 * @param gender
	 * @param address
	 * @param contactDetails
	 * @param doctorID
	 * @param department
	 */
	public Doctor(String personID, String name, int age, String gender, String address, String contactDetails, String doctorID, String department) {
		super(personID, name, age, gender, address, contactDetails);
		this.doctorID = doctorID;
		this.department = department;
	}
	
	/**
	 * Allows the doctor to view patients details
	 * @param patient
	 */
	public void seePatientDetails(Patient patient) {
		patient.viewPersonalDetails();
	}
	
	/**
	 * Allows the doctor to prescribe treatment
	 * @param patient
	 * @param type
	 * @param description
	 * @return
	 */
	public Treatment prescribeTreatment(Patient patient, String type, String description) {
		return new Treatment("T001", type, description);
	}
	
	
	public String getDoctorID() {
		return doctorID;
	}
	
	
	public String getDepartment() {
		return department;
	}
}
