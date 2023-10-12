package com.gathergrid.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Time;
import java.util.*;

//import Category;
@Data
@Entity
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date date;
    private Time hour;
    private String location;
    private String description;

    @ManyToOne
    private Category category;

    @OneToMany
    private List<Comment> comments;

    public Event() {
    }


}
