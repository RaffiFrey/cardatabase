package com.rfrey.cardatabase;

import com.rfrey.cardatabase.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardatabaseApplication {

	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	private final CarRepository repository;
	private final OwnerRepository ownerRepository;
	private final AppUserRepository appUserRepository;

    public CardatabaseApplication(CarRepository repository, OwnerRepository ownerRepository, AppUserRepository appUserRepository) {
        this.repository = repository;
        this.ownerRepository = ownerRepository;
		this.appUserRepository = appUserRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}
}
