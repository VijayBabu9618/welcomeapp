package com.vijay.welcomeapp.service;

import org.springframework.stereotype.Service;

import com.vijay.welcomeapp.repository.WelcomeRepository;

@Service
public class WelcomeService {

    private final WelcomeRepository repository;

    public WelcomeService(WelcomeRepository repository) {
        this.repository = repository;
    }

    public String getWelcomeMessage() {
        return repository.getMessage();
    }

}