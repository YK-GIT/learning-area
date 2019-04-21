package com.hef.spittr.domain;


import java.io.Serializable;

public class Spitter implements Serializable {


    private static final Long serialVersionUID = 2361L;

    private Long id;
    //username, password, fullName, email, updateByEmail
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Boolean updateByEmail;

    public Spitter() {
    }

    public Spitter(Long id, String fullName,
                   String username,
                   String password,
                   String email,
                   Boolean updateByEmail) {
        this.id = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.updateByEmail = updateByEmail;
    }

    public Spitter(String fullName,
                   String username,
                   String password,
                   String email,
                   Boolean updateByEmail) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.updateByEmail = updateByEmail;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getUpdateByEmail() {
        return updateByEmail;
    }

    public void setUpdateByEmail(Boolean updateByEmail) {
        this.updateByEmail = updateByEmail;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", updateByEmail=" + updateByEmail +
                '}';
    }
}
