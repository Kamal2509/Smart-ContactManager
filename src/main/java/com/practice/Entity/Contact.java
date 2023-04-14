package com.practice.Entity;

import jakarta.persistence.*;

@Entity
public class Contact {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String Secondname;
    private String email;
    private String work;

    @ManyToOne
    private User user;
    public Contact() {
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

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        Secondname = secondname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Secondname='" + Secondname + '\'' +
                ", email='" + email + '\'' +
                ", work='" + work + '\'' +
                ", user=" + user +
                '}';
    }
}
