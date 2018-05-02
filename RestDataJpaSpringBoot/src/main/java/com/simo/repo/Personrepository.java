package com.simo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.simo.entite.Person;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")

public interface Personrepository extends JpaRepository<Person, Long> {
	List<Person> findByLastName(@Param("name") String name);

}
