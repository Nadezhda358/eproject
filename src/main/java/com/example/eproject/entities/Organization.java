package com.example.eproject.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String address;
    private String description;
    private String email;
    private String phone;
    private boolean isVerified;

    public Organization(Integer id, String title, String address, String description, String email, String phone, boolean isVerified) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.description = description;
        this.email = email;
        this.phone = phone;
        this.isVerified = isVerified;
    }
    public Organization() {
        this.id = 0;
        this.title = "exampleCompany";
        this.address = "unknown";
        this.description = "greatest test company";
        this.email = "testEmail@abv.bg";
        this.phone = "012391313";
        this.isVerified = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }
}
