package za.co.pvi.people;

public abstract class Person {

	public Person() {
	}
	private String surname;
	private String firstName;
	private String dateOfBirth;
	private String idNumber;
	private String emailAddress;
	private String cellPhoneNumber;
	private String gender;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [\nsurname: " + surname + "\nfirstName: " + firstName + "\ndateOfBirth: " + dateOfBirth
				+ "\nidNumber: " + idNumber + "\nemailAddress: " + emailAddress + "\ncellPhoneNumber: "
				+ cellPhoneNumber + "\ngender: " + gender + "]";
	}

}
