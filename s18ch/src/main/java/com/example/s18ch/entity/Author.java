package com.example.s18ch.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Notes:
 * Author can has more than one books that´s why used @OneToMany annotations
 */
@NoArgsConstructor
@Data
@Entity
@Table(name = "author", schema = "fsweb")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;


}
