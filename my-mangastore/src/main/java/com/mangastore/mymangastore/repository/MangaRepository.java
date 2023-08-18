package com.mangastore.mymangastore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangastore.mymangastore.model.Manga;

public interface MangaRepository extends JpaRepository<Manga, Long> {
    // Find books by title
    List<Manga> findByTitleContainingIgnoreCase(String title);

    // Find books by author
    List<Manga> findByAuthorContainingIgnoreCase(String author);

    // Find books by category
    List<Manga> findByGenre(String Genre);

    // Find books by title and author
    List<Manga> findByTitleContainingIgnoreCaseAndAuthorContainingIgnoreCase(String title, String author);

    // Find books by title or author
    List<Manga> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author);

    // Additional custom query methods can be added here
}