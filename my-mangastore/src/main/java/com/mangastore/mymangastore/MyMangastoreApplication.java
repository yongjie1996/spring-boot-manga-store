package com.mangastore.mymangastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.mangastore.mymangastore.model")
public class MyMangastoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMangastoreApplication.class, args);
	}

}
