package com.sss.library.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Date issued_date;
    private Date due_date;
    private Long book_id;
    private Long user_id;

    public Borrow() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(Date issued_date) {
        this.issued_date = issued_date;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
