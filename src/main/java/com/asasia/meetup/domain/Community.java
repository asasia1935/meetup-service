package com.asasia.meetup.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Community {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    // 생성 시각 (정렬/로그/추적 용도)
    private LocalDateTime createdAt;

    // JPA 리플렉션 사용을 위한 기본 생성자
    protected Community() {}

    // 생성자
    public Community(String name, String description) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }
}
