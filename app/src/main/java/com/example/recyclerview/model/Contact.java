package com.example.recyclerview.model;

public class Contact {

    private String name;
    private String phone;
    private String imageUrl;

    public Contact(String name, String phone, String imageUrl) {
        this.name = name;
        this.phone = phone;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
