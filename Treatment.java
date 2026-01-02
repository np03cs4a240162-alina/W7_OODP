
package week7;
/**
 * Represents a treatment prescribed to a patient by a doctor.
 */
public class Treatment {
	private String treatmentID;
	private String type;
	private String description;
	
	/**
	 * Constructs a Treatment Constructor
	 * @param treatmentID
	 * @param type
	 * @param description
	 */
	public Treatment(String treatmentID, String type, String description) {
		this.treatmentID = treatmentID;
		this.type = type;
		this.description = description;
	}
	/**
	 * Updates the treatment details
	 * @param description
	 */
	public void updateDescription( String description) {
		this.description = description;
	}
	
	/**
	 * Displays Treatment Details.
	 */
	public void viewTreatmentDetails() {
		System.out.println("Treatment ID: " + treatmentID);
		System.out.println("Type: " + type);
		System.out.println("Description: " + description);
	}
}
