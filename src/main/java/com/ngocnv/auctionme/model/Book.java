package com.ngocnv.auctionme.model;

import javax.persistence.*;

/**
 * Created by framgia on 18/01/2017.
 */

@Entity
@Table(name = "book")
public class Book extends Publication {

    @Id
    @GeneratedValue
    @AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="id"))
    })
    private Long id;

    @Column(name = "pages")
	private int pages;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
