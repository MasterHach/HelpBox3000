package com.example.HelpBox3000.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(max = 120)
    private String email;

    @Size(max = 255, min = 8)
    private String password;

    @Size(max = 32)
    private String name;

    @Size(max = 32)
    private String surname;

    private String role;
}
