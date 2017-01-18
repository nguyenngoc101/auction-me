package com.ngocnv.auctionme.model;

import javax.persistence.*;

/**
 * Created by framgia on 18/01/2017.
 */

@Entity
@Table(name="blog_post")
public class BlogPost extends Publication {

    @Id
    @GeneratedValue
    private Long id;

    @Column
	private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
