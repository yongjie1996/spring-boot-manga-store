import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final MangaRepository mangaRepository;

    public DatabaseInitializer(MangaRepository mangaRepository) {
        this.mangaRepository = mangaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save Book instances
        Manga manga1 = new Manga("Title 1", "Author 1", "Category 1");
        Manga manga2 = new Manga("Title 2", "Author 2", "Category 2");

        mangaRepository.save(manga1);
        mangaRepository.save(manga2);
    }
}
