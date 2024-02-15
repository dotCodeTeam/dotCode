package com.ohgiraffers.java.teamProject.library.test.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO(){}

    public void BookDTO(int category,String title,String author){
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }
    public int getbNo() {
        return bNo;
    }
    public void setCategory(int category){
        this.category = category;
    }
    public int getCategory(){
        return category;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
