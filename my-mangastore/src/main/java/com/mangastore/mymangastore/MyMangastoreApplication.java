package com.mangastore.mymangastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "manga")
public class MyMangastoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMangastoreApplication.class, args);
	}

}
