package com.api.book.bootRestApiBook.Model;


import com.api.book.bootRestApiBook.entity.Author;

public class BookDTO {
    private  String title;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookDTO(){

    }

    public BookDTO(String title, Author author) {
        this.title = title;
        this.author = author;
    }

}
