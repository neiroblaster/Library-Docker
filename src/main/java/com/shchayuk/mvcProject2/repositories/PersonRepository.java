package com.shchayuk.mvcProject2.repositories;

import com.shchayuk.mvcProject2.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {
    Person findPersonByName(String name);

    Person findPersonByBooksId(int id);
}
