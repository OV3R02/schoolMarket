/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolmarket;

/**
 *
 * @author utentepc
 */
class Book {
    
    private String bookName;
    private int classBefore;
    private int cost;
    private String bookHealth;

    public Book(String bookName, int classBefore, int cost, String bookHealth) {
        this.bookName = bookName;
        this.classBefore = classBefore;
        this.cost = cost;
        this.bookHealth = bookHealth;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookHealth() {
        return bookHealth;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookHealth(String bookHealth) {
        this.bookHealth = bookHealth;
    }

    public int getClassBefore() {
        return classBefore;
    }

    public void setClassBefore(int classBefore) {
        this.classBefore = classBefore;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
        @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", classBefore=" + classBefore + ", cost=" + cost + ", bookHealth=" + bookHealth + '}';
    }
    
}
