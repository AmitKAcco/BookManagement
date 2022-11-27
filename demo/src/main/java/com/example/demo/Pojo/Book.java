package com.example.demo.Pojo;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity

@Table(name = "books")
public class Book {

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "serialNo", length = 50, nullable = false)
    private Long serialNo;

    @Column(name = "price", length = 50, nullable = false)
    private Long price;

    @Column(name = "bookName", length = 50, nullable = false)
    private String bookName;

    @ManyToMany( cascade = { CascadeType.ALL})
	@JoinTable(name = "booksAuthors", joinColumns = { @JoinColumn(name = "bookId" , referencedColumnName = "bookId") }, inverseJoinColumns = {
			@JoinColumn(name = "authorId") })
	private Set<Author> authors = new HashSet<Author>();

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    @ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "booksCategories", joinColumns = { @JoinColumn(name = "bookId", referencedColumnName = "bookId") }, inverseJoinColumns = {
			@JoinColumn(name = "categoryId") })
	private Set<Category> categories = new HashSet<Category>();

    @OneToMany(cascade = { CascadeType.ALL })
    private Set<Review> reviews= new HashSet<>();

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    public Set<Author> getAuth() {
//        return auth;
//    }
//
//    public void setAuth(Set<Author> auth) {
//        this.auth = auth;
//    }

//    public Set<Category> getCat() {
//        return cat;
//    }
//
//    public void setCat(Set<Category> cat) {
//        this.cat = cat;
//    }
}