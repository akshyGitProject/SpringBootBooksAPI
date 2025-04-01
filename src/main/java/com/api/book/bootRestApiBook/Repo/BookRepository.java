package com.api.book.bootRestApiBook.Repo;

import com.api.book.bootRestApiBook.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Optional<Book> findById(Integer id); // Correct return type

}
