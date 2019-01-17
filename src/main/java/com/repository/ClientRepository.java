package com.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    Optional<Client> findByUsername(String username);
}
