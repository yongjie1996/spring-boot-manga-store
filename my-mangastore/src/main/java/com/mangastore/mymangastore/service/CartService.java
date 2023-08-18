package com.mangastore.mymangastore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangastore.mymangastore.model.CartItem;
import com.mangastore.mymangastore.model.Manga;
import com.mangastore.mymangastore.model.User;
import com.mangastore.mymangastore.repository.CartItemRepository;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public Manga addItemToCart(User user, Manga manga, int quantity) {
        // Check if the item is already in the cart for the user
        CartItem existingCartItem = cartItemRepository.findByUserAndManga(user, manga);

        if (existingCartItem != null) {
            existingCartItem.setQuantity(existingCartItem.getQuantity() + quantity);
        } else {
            CartItem cartItem = new CartItem();
            cartItem.setUser(user);
            cartItem.setManga(manga);
            cartItem.setQuantity(quantity);
            cartItemRepository.save(cartItem);
        }
        return manga;
    }

    // Other methods to update, remove items, get cart items, etc.
}