package com.example.librarymanagementsystem.model;

public enum UserRole {
    MEMBER, STAFF, MANAGER, ADMIN;

    @Override
    // Capitalize the first letter and keep the rest as is
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
