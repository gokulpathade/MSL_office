package com.konarch.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table()
public class Hoto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotNull(message = "Data cannot be null")
    private String Data;

    @NotNull(message = "Hoto1 cannot be null")
    private String hoto1;

    private String hoto2;
    private String hoto3;
    private String hoto4;

    @PastOrPresent(message = "Date cannot be in the future")
    private LocalDate date;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;
    
    
    public Hoto() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    

	public Hoto(int id,
			@NotNull(message = "Name cannot be null") @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters") String name,
			@NotNull(message = "Data cannot be null") String data,
			@NotNull(message = "Hoto1 cannot be null") String hoto1, String hoto2, String hoto3, String hoto4,
			@PastOrPresent(message = "Date cannot be in the future") LocalDate date, User user) {
		super();
		this.id = id;
		this.name = name;
		Data = data;
		this.hoto1 = hoto1;
		this.hoto2 = hoto2;
		this.hoto3 = hoto3;
		this.hoto4 = hoto4;
		this.date = date;
		this.user = user;
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


	public String getData() {
		return Data;
	}


	public void setData(String data) {
		Data = data;
	}


	public String getHoto1() {
		return hoto1;
	}


	public void setHoto1(String hoto1) {
		this.hoto1 = hoto1;
	}


	public String getHoto2() {
		return hoto2;
	}


	public void setHoto2(String hoto2) {
		this.hoto2 = hoto2;
	}


	public String getHoto3() {
		return hoto3;
	}


	public void setHoto3(String hoto3) {
		this.hoto3 = hoto3;
	}


	public String getHoto4() {
		return hoto4;
	}


	public void setHoto4(String hoto4) {
		this.hoto4 = hoto4;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "Hoto [id=" + id + ", name=" + name + ", Data=" + Data + ", hoto1=" + hoto1 + ", hoto2=" + hoto2
				+ ", hoto3=" + hoto3 + ", hoto4=" + hoto4 + ", date=" + date + ", user=" + user + "]";
	}
    
    
    
    
    
}
