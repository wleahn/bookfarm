package com.apps.bookfarm.Author;

import com.apps.bookfarm.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByPhoneNumber(int phoneNumber);
    Optional<Author> findByAuthorName(String name);

}
