package com.apps.bookfarm.Author;

import com.apps.bookfarm.Model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findByPhoneNumber(int phoneNumber);
    Optional<Author> findByAuthorName(String name);

}
