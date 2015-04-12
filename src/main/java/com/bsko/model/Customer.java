package com.bsko.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Пользователь on 11.04.2015.
 */
@NamedQueries(
        @NamedQuery(name="getAll", query = "from Customer")
)
@Entity
@Table(name = "customer")
@XmlRootElement
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", unique = true)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "birth", nullable = false)
    private Date birth;
    @Column(name = "dul_series", nullable = true)
    private String dulSeries;
    @Column(name = "dul_number", nullable = true)
    private String dulNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDulSeries() {
        return dulSeries;
    }

    public void setDulSeries(String dulSeries) {
        this.dulSeries = dulSeries;
    }

    public String getDulNumber() {
        return dulNumber;
    }

    public void setDulNumber(String dulNumber) {
        this.dulNumber = dulNumber;
    }
}
