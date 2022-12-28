package Model;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Students{
    // creation of instance variable
	

    // creation of public getter and setter --> for student ID
	private String f_name;
	private String l_name;
	private String email;
	private int std_contact;
	private String parents_name;
	private String parent_contact;
	private String password;
	private String dob;
	private String security_qn;
	private String security_ans;

	public Students(String f_name, String l_name, String email, int std_contact, String parents_name, String parent_contact, String password, String dob, String security_qn, String security_ans) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.std_contact = std_contact;
		this.parents_name = parents_name;
		this.parent_contact = parent_contact;
		this.password = password;
		this.dob = dob;
		this.security_qn = security_qn;
		this.security_ans = security_ans;
	}

	public Students(JTextField emailText, JPasswordField passText) {
    }

    // public Students()
	public String getF_name() {
		return this.f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return this.l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStd_contact() {
		return this.std_contact;
	}

	public void setStd_contact(int std_contact) {
		this.std_contact = std_contact;
	}

	public String getParents_name() {
		return this.parents_name;
	}

	public void setParents_name(String parents_name) {
		this.parents_name = parents_name;
	}

	public String getParent_contact() {
		return this.parent_contact;
	}

	public void setParent_contact(String parent_contact) {
		this.parent_contact = parent_contact;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSecurity_qn() {
		return this.security_qn;
	}

	public void setSecurity_qn(String security_qn) {
		this.security_qn = security_qn;
	}

	public String getSecurity_ans() {
		return this.security_ans;
	}

	public void setSecurity_ans(String security_ans) {
		this.security_ans = security_ans;
	}

   

}