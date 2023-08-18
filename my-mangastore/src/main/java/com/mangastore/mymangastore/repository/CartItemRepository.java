package com.mangastore.mymangastore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mangastore.mymangastore.model.CartItem;
import com.mangastore.mymangastore.model.Manga;
import com.mangastore.mymangastore.model.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUser(User user);

    CartItem findByUserAndManga(User user, Manga manga);
}