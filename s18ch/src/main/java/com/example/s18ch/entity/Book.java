package com.example.s18ch.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Notes:
 * When we delete author , the books author wrote will delete according to CascadeType.ALL
 *
 */

@NoArgsConstructor
@Data
@Entity
@Table(name = "book", schema = "fsweb")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "book_name" )
    private String bookName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;



}
