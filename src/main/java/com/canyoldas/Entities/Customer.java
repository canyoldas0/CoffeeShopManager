package com.canyoldas.Entities;

import com.canyoldas.Abstract.IEntity;

import java.util.Date;

public class Customer implements IEntity {

    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String tckn;

    public Customer() {

    }




     public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationality, String tckn) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.tckn= tckn;
    }

    private String nationality;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }




	public String getTckn() {
		return tckn;
	}




	public void setTckn(String tckn) {
		this.tckn = tckn;
	}





}
