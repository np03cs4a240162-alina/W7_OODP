
package week7;

public class HospitalMain {
public static void main(String[] args) {
	Doctor d1 = new Doctor("D001", "Dr.Break", 34, "Male", "Lalitpur", "2122323", "DOC001", "Cardiology");
	
	Patient p1 = new Patient("P001", "Rohit Joshi", 20, "Male", "Lalitpur", "3454343", "PAT001");
	
	Appointment ap1 = p1.bookAppointment(d1, "2025-12-23", "10:40AM");
	System.out.println("Appointment Details:");
	ap1.viewAppointmentDetails();
	System.out.println();
	
	System.out.println("Doctor View Patients Details:");
	p1.viewPersonalDetails();
	System.out.println();
	
	Treatment t1 = d1.prescribeTreatment(p1, "Medication", "Take one pill daily");
	System.out.println("Treatment Details:");
	t1.viewTreatmentDetails();
	System.out.println();
	
	ap1.rescheduleAppointment("2025-12-24", "11:00 AM");
	System.out.println("Rescheduled Appointment:");
	ap1.viewAppointmentDetails();
	System.out.println();
	
	ap1.cancelAppointment();
	
}
}
