package com.rfrey.cardatabase.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class OwnerRepositoryTest {
    @Autowired
    private OwnerRepository repository;

    @Test
    void saveOwner() {
        repository.save(new Owner("Leyla", "Frey"));
        assertThat(repository.findByFirstName("Leyla").isPresent()).isTrue();
    }

    @Test
    void deleteOwners() {
        repository.save(new Owner("Anouk", "Frey"));
        repository.deleteAll();
        assertThat(repository.count()).isEqualTo(0);
    }
}
