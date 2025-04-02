package com.api.book.bootRestApiBook.entity;

import jakarta.persistence.*;


@Entity
@Table(name="Author_API")
public class Author {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int authorid;

    private String firstName;
    private String lastName;
    private String lang;

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
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

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Author(){

    }

    public Author(int authorid, String firstName, String lastName, String lang) {
        this.authorid = authorid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lang = lang;
    }
}
