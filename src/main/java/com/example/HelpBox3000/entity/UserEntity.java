package com.example.HelpBox3000.entity;

import lombok.*;

import javax.persistence.*;

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

    private String email;

    private String password;

    private String name;
    private String surname;

    private String role;
}
