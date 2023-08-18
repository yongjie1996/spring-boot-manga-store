package com.mangastore.mymangastore.controller;

import com.mangastore.mymangastore.repository.MangaRepository;
import com.mangastore.mymangastore.model.Manga;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MangaController {
    private final MangaRepository mangaRepository;

    public MangaController(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    @GetMapping("/catalog")
    public String catalog(Model model) {
        List<Manga> manga = mangaRepository.findAll();
        model.addAttribute("manga", manga);
        return "catalog"; // Return the name of the Thymeleaf template
    }
}