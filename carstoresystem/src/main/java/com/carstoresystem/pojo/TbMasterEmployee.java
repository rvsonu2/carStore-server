package com.carstoresystem.pojo;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_master_employee")
public class TbMasterEmployee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String prefferedName;
	private String gender;
	private String phone;
	private String dateOfBirth;
	private String email;
	private String role;
	private String password;
	private String address;
	private byte[] photos;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	private boolean enabled;
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	@Column(name="firstName",length=45)
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	@Column(name="lastName",length=45)
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the prefferedName
	 */
	@Column(name="prefferedName",length=100)
	public String getPrefferedName() {
		return prefferedName;
	}
	/**
	 * @param prefferedName the prefferedName to set
	 */
	public void setPrefferedName(String prefferedName) {
		this.prefferedName = prefferedName;
	}
	/**
	 * @return the gender
	 */
	@Column(name="gender",length=45)
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the phone
	 */
	@Column(name="phone",length=45)
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the dateOfBirth
	 */
	@Column(name="dateOfBirth",length=45)
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the email
	 */
	@Column(name="email",length=100)
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the role
	 */
	@Column(name="role",length=45)
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the password
	 */
	@Column(name="password",length=100)
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the address
	 */
	@Column(name="address",length=500)
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the photos
	 */
	
	/**
	 * @return the createdBy
	 */
	@Column(name="createdBy",length=45)
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @return the photos
	 */
	@Column
	public byte[] getPhotos() {
		return photos;
	}
	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(byte[] photos) {
		this.photos = photos;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the createdOn
	 */
	@CreationTimestamp
	@Column(name="createdOn",length=45)
	public Date getCreatedOn() {
		return createdOn;
	}
	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	/**
	 * @return the updatedBy
	 */
	@Column(name="updatedBy",length=45)
	public String getUpdatedBy() {
		return updatedBy;
	}
	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	/**
	 * @return the updatedOn
	 */
	@UpdateTimestamp
	@Column(name="updatedOn",length=45)
	public Date getUpdatedOn() {
		return updatedOn;
	}
	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	/**
	 * @return the enabled
	 */
	@Column(name="enabled")
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
