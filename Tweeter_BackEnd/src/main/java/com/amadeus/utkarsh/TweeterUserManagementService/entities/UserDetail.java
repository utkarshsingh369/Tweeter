package com.amadeus.utkarsh.TweeterUserManagementService.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "user_details")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ud_id_seq")
    @SequenceGenerator(name = "ud_id_seq",sequenceName = "ud_id_seq",initialValue = 1,allocationSize=1)
    private int ud_id;

    @OneToOne(cascade = {CascadeType.ALL,CascadeType.REMOVE},orphanRemoval = true)
    @JsonManagedReference
    private UserCredential cred;

    @OneToOne(mappedBy = "userDetails")
    @JsonBackReference
    private User user;

    private String first_name;
    private String last_name;
    private String email;
    private int dobYear;
    private int dobMonth;
    private int dobDate;

    private String phone;
    private String bio;
    private boolean isVerified;


    /*****************************************************************************************************/


    public UserDetail(int ud_id, UserCredential cred, User user, String first_name, String last_name, String email, int dobYear, int dobMonth, int dobDate, String phone, String bio, boolean isVerified) {
        this.ud_id = ud_id;
        this.cred = cred;
        this.user = user;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.dobYear = dobYear;
        this.dobMonth = dobMonth;
        this.dobDate = dobDate;
        this.phone = phone;
        this.bio = bio;
        this.isVerified = isVerified;
    }

    public UserDetail() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDobYear() {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobDate() {
        return dobDate;
    }

    public void setDobDate(int dobDate) {
        this.dobDate = dobDate;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public int getUd_id() {
        return ud_id;
    }

    public void setUd_id(int ud_id) {
        this.ud_id = ud_id;
    }

    public UserCredential getCred() {
        return cred;
    }

    public void setCred(UserCredential cred) {
        this.cred = cred;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
