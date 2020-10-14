package edu.ait.hospitalmanagement.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "patient")
public class Patient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emergency_Id")
    private long emergencyId;

    private String address;

    @OneToOne(targetEntity = HospitalUser.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<HospitalUser> hospitalUsers;


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

    public List<HospitalUser> getHospitalUsers() {
        return hospitalUsers;
    }

    public void setHospitalUsers(List<HospitalUser> hospitalUsers) {
        this.hospitalUsers = hospitalUsers;
    }

    public Patient() {
    }

    public Patient(long emergencyId, String address, List<HospitalUser> hospitalUsers) {
        this.emergencyId = emergencyId;
        this.address = address;
        this.hospitalUsers = hospitalUsers;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "emergencyId=" + emergencyId +
                ", address='" + address + '\'' +
                ", hospitalUsers=" + hospitalUsers +
                '}';
    }
}
