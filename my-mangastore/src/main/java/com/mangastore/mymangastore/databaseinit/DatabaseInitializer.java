package com.mangastore.mymangastore.databaseinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mangastore.mymangastore.model.Manga;
import com.mangastore.mymangastore.repository.MangaRepository;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private final MangaRepository mangaRepository;

    public DatabaseInitializer(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save Book instances
        initializeBooks();
    }

    private void initializeBooks() {
        Manga manga1 = new Manga("Title 1", "Author 1", "Category 1");
        Manga manga2 = new Manga("Title 2", "Author 2", "Category 2");

        mangaRepository.save(manga1);
        mangaRepository.save(manga2);
    }
}
