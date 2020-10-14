package edu.ait.hospitalmanagement.dto;



import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="hospitaluser")
public class HospitalUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name= "last_name")
    private String lastName;

    private Date dob;

    private int age;

    private String country;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name="email_id")
    private String emailId;

    private String password;

    @OneToOne(targetEntity = Patient.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "emergency_Id")
    private List<Patient> patient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public HospitalUser() {
    }

    public HospitalUser(Integer id, String firstName, String lastName, Date dob, int age, String country, String mobileNumber, String emailId, String password, List<Patient> patient) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.country = country;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.password = password;
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "HospitalUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", patient=" + patient +
                '}';
    }
}
