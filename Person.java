package week7;

public class Person {
    protected String personID;
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
    protected String contactDetails;
    
    /**
     * 
     * @param personID unique identifier for the person
     * @param name full name of the person
     * @param age age of the person
     * @param gender gender of the person
     * @param address address of the person
     * @param contactDetails contact details of the person
     */ 
    
    public Person(String personID, String name, int age, String gender, String address, String contactDetails) {
    	this.personID = personID;
    	this.name = name;
    	this.age = age;
    	this.gender = gender;
    	this.address = address;
    	this.contactDetails = contactDetails;
    }
    
    public void viewPersonalDetails() {
    	System.out.println("Person Id: " + personID);
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Gender: " + gender);
    	System.out.println("Address: " + address);
    	System.out.println("Contact Details: " + contactDetails);
    }
    
}