package com.example.HelpBox3000.entity;

public enum Roles {
    USER("0"),
    ADMIN("1");

    public final String code;

    Roles(final String code) {
        this.code = code;
    }
}
