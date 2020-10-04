package edu.ait.hospitalmanagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Patient extends HospitalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emergencyId;

    private String address;

    public Patient(String id, String firstName, String lastName, Date dob, int age, String country, String mobileNumber, String emailId, String password, long emergencyId, String address) {
        super(id, firstName, lastName, dob, age, country, mobileNumber, emailId, password);
        this.emergencyId = emergencyId;
        this.address = address;
    }

    public long getEmergencyId() {
        return emergencyId;
    }

    public void setEmergencyId(long emergencyId) {
        this.emergencyId = emergencyId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "emergencyId=" + emergencyId +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HospitalUser hospitalUser = new HospitalUser();
    }
}
