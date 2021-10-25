package com.springmsa.rebels.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rebels {
        @Id
        @GeneratedValue
        private int id;
        private String lastName;
        private String firstName;
        private Date birthDate;
        private int licenseNumber;
        private Date licenseDate;

        public Rebels (int id, String lastName, String firstName, Date birthDate, int licenseNumber, Date licenseDate){

            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.birthDate = birthDate;
            this.licenseNumber = licenseNumber;
            this.licenseDate =  licenseDate;

        }

        public Rebels (){

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(Date licenseDate) {
        this.licenseDate = licenseDate;
    }
}
