package com.konarch.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table()
public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    @NotBlank(message = "Name is mandatory")
	    private String name;

	    @Min(value = 1, message = "Age should not be less than 18")
	    @Max(value = 150, message = "Age should not be greater than 150")
	    private int age;

	    @NotBlank(message = "Contact is mandatory")
	    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid contact number")
	    private String contact;

	    @NotBlank(message = "Address is mandatory")
	    private String address;

	    @NotBlank(message = "Email is mandatory")
	    @Email(message = "Email should be valid")
	    private String email;

	    @NotBlank(message = "Password is mandatory")
	    @Size(min = 2, message = "Password should have at least 8 characters")
	    private String password;


	   
	    @NotBlank(message = "Role is mandatory")
	    private String role;
	   
	   
	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	    @JsonManagedReference
	    private List<Hoto> hotos;
	    
	    
	   public User() {
			super();
			// TODO Auto-generated constructor stub
		}


	public User(int id, @NotBlank(message = "Name is mandatory") String name,
			@Min(value = 1, message = "Age should not be less than 18") @Max(value = 150, message = "Age should not be greater than 150") int age,
			@NotBlank(message = "Contact is mandatory") @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid contact number") String contact,
			@NotBlank(message = "Address is mandatory") String address,
			@NotBlank(message = "Email is mandatory") @Email(message = "Email should be valid") String email,
			@NotBlank(message = "Password is mandatory") @Size(min = 2, message = "Password should have at least 8 characters") String password,
			@NotBlank(message = "Role is mandatory") String role, List<Hoto> hotos) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.role = role;
		this.hotos = hotos;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public List<Hoto> getHotos() {
		return hotos;
	}


	public void setHotos(List<Hoto> hotos) {
		this.hotos = hotos;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + ", address=" + address
				+ ", email=" + email + ", password=" + password + ", role=" + role + ", hotos=" + hotos + "]";
	}

	   

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

	

