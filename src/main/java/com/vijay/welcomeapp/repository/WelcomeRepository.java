package com.vijay.welcomeapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomeRepository {

    public String getMessage() {
        return "Welcome Vijay";
    }

}