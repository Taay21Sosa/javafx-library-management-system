package com.example.librarymanagementsystem.model;

public enum UserStatus {
    ACTIVE, SUSPENDED, EXPIRED, DELETED, BANNED;

    @Override
    // Capitalize the first letter and keep the rest as is
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
