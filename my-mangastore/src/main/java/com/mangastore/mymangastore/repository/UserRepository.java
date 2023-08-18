package com.mangastore.mymangastore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangastore.mymangastore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}