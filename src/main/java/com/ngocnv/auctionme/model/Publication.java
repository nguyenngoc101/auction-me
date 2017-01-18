package com.ngocnv.auctionme.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by framgia on 18/01/2017.
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "publication")
public class Publication implements Serializable {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	protected Long id;

	@Column
	protected String title;

	@Column(name = "version")
	private int version;

	@Column
	@Temporal(TemporalType.DATE)
	private Date publishingDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
