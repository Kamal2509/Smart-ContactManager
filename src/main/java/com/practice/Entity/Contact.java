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
    private String phone;
    private String image;
    @Column(length = 50000)
    private String description;
    

    @ManyToOne
    private User user;


	public Contact() {
		super();
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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", Secondname=" + Secondname + ", email=" + email + ", work="
				+ work + ", phone=" + phone + ", image=" + image + ", description=" + description + ", user=" + user
				+ "]";
	}
    
    
    
   
}
