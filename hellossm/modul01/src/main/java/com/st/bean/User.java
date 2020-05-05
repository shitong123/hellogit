package com.st.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;

    private String name;

    private String phone;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate birthday;

    private String address;

    public User() {
    }
    public User(int id,String phone){

    }

    public User(String phone,int id){

    }

    public User(String name, String phone, LocalDate birthday, String address) {
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
