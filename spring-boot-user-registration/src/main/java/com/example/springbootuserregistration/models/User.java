package com.example.springbootuserregistration.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "RegistrationId")
	private String registrationId;
	
	@Column(name = "InstitutionId")
	private String institutionId;
	
	@Column(name = "UserId")
	private String userId;
	
	@Column(name = "FisrtName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName; 
	
	@Column(name = "RegistrationDate")
	private String registrationDate;
	
	@Column(name = "DateOfBirth")
	private String dateOfBirth;
	
	@Column(name = "Age")
	private Integer age; 
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Nid")
	private String nid;
	
	@Column(name = "Occupation")
	private String occupation;
	
	@Column(name = "PresentAddress")
	private String presentAddress;
	
	@Column(name = "PermanentAddress")
	private String permanentAddress;
	
	@Column(name = "ContactNo")
	private String contactNo;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "PhotoUrl")
	private String photoUrl;
	
	@Column(name = "CreatedOn")
	private String createdOn; 
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "AcademicQualification")
	private String academicQulifications;

	public User() {
		
	}
	
	public User(String registrationId, String institutionId, String userId, String firstName, String lastName,
			String registrationDate, String dateOfBirth, Integer age, String gender, String nid, String occupation,
			String presentAddress, String permanentAddress, String contactNo, String email, String photoUrl,
			String createdOn, String createdBy, String academicQulifications) {
		this.registrationId = registrationId;
		this.institutionId = institutionId;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.registrationDate = registrationDate;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.nid = nid;
		this.occupation = occupation;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		this.contactNo = contactNo;
		this.email = email;
		this.photoUrl = photoUrl;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.academicQulifications = academicQulifications;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getAcademicQulifications() {
		return academicQulifications;
	}

	public void setAcademicQulifications(String academicQulifications) {
		this.academicQulifications = academicQulifications;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", registrationId=" + registrationId + ", institutionId=" + institutionId
				+ ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", registrationDate="
				+ registrationDate + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", gender=" + gender + ", nid="
				+ nid + ", occupation=" + occupation + ", presentAddress=" + presentAddress + ", permanentAddress="
				+ permanentAddress + ", contactNo=" + contactNo + ", email=" + email + ", photoUrl=" + photoUrl
				+ ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", academicQulifications="
				+ academicQulifications + "]";
	}
	
	
}
