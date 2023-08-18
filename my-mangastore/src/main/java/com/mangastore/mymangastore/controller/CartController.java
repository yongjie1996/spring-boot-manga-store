package com.mangastore.mymangastore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mangastore.mymangastore.model.Manga;
import com.mangastore.mymangastore.model.User;
import com.mangastore.mymangastore.repository.MangaRepository;
import com.mangastore.mymangastore.service.CartService;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @Autowired
    private MangaRepository mangaRepository;

    @PostMapping("/cart/add")
    public String addItemToCart(@RequestParam Long mangaId, @RequestParam int quantity) {
        // Retrieve the authenticated user
        User user = getCurrentUser();

        // Retrieve the manga by mangaId
        Manga manga = mangaRepository.findById(mangaId).orElseThrow(() -> new RuntimeException("Book not found"));

        cartService.addItemToCart(user, manga, quantity);

        return "redirect:/cart"; // Redirect to the cart page
    }

    // Other methods for updating, removing, and viewing the cart

    private User getCurrentUser() {
        // Your implementation to retrieve the authenticated user goes here
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            // Assuming that your UserDetailsService returns a User object
            // that implements UserDetails, you can cast it to User and return it.
            return (User) userDetails;
        }
        return null;
    }
}