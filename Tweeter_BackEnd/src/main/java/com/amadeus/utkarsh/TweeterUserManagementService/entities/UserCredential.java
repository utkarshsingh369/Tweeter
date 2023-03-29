package com.amadeus.utkarsh.TweeterUserManagementService.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "user_credentials")
public class UserCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cred_id_seq")
    @SequenceGenerator(name = "cred_id_seq",sequenceName = "cred_id_seq",initialValue = 1,allocationSize=1)
    private int cred_id;
    private String username;
    private String password;

    @OneToOne(mappedBy = "cred")
    @JsonBackReference
    private UserDetail userDetails;

    public UserCredential() {
    }

    public UserCredential(int cred_id, String username, String password) {
        this.cred_id=cred_id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getCred_id() {
        return cred_id;
    }

    public void setCred_id(int cred_id) {
        this.cred_id = cred_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
