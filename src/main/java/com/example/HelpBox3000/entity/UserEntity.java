package com.example.HelpBox3000.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "User")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @PrimaryKeyJoinColumn
    private String email;

    private String password;

    private String name;
    private String surname;

    private String role;

    public UserEntity(String email, String password, String name, String surname, String role) {
        setEmail(email);
        setName(name);
        setSurname(surname);
        setPassword(password);
        setRole(role);
    }
}
