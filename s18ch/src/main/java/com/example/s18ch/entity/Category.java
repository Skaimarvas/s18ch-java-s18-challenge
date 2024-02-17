package com.example.s18ch.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * Notes:
 * category has more than one books that´s why we used @OneToMany annotation
 */


@NoArgsConstructor
@Entity
@Data
@Table(name = "category", schema = "fsweb")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Book> books;
}
