package com.ngocnv.auctionme.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by ngocnv on 08/01/2017.
 */

@Embeddable
public class Address {

    @Column(name="city")
    private String city;

    @Column(name="street")
    private String street;

    @Column(name = "zip_code")
    private String zipCode;

    public Address() {}

    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
