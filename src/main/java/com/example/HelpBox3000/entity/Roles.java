package com.example.HelpBox3000.entity;

public enum Roles {
    USER("user"),
    ADMIN("admin");

    public final String code;

    Roles(final String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.code;
    }
}
