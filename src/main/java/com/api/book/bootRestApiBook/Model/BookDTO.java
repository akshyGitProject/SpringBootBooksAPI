package com.api.book.bootRestApiBook.Model;



public class BookDTO {

    private  String title;
   private  String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookDTO(){

    }

    public BookDTO(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
