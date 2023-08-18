package com.mangastore.mymangastore.databaseinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

    }

}
