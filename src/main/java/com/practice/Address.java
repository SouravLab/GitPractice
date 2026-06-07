package com.practice;

public class Address {
    private final String city;
    private final String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return String.format("Address{city='%s', country='%s'}", city, country);
    }
}
