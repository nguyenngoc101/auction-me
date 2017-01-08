package com.ngocnv.auctionme.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ngocnv on 08/01/2017.
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private String age;

    @Embedded
    private Address homeAddress;

//    @Embedded
//    private Address billingAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

//    public Address getBillingAddress() {
//        return billingAddress;
//    }
//
//    public void setBillingAddress(Address billingAddress) {
//        this.billingAddress = billingAddress;
//    }
}
