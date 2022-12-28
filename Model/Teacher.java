package Model;

public class Teacher{
    // creation of instance variable
	

    // creation of public getter and setter --> for Teacher ID
	private String fistname;
	private String lastname;
	private String contact;
	private String subject;
	

	public Teacher(String fistname, String lastname, String contact, String subject) {
		this.fistname = fistname;
		this.lastname = lastname;
		this.contact = contact;
		this.subject = subject;
	}

	// public Teacher()
	public String getFistname() {
		return this.fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setL_name(String lastname) {
		this.lastname = lastname;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
}