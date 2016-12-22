package com.ngocnv.auctionme.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by framgia on 22/12/2016.
 */

@Entity
@Table(name="item")
public class Item implements Serializable{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
