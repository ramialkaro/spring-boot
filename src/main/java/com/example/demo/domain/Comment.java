package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    // comment

}
