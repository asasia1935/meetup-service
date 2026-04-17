package com.asasia.meetup.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Community {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
}
