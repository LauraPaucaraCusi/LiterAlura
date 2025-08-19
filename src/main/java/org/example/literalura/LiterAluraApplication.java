package org.example.literalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

    private final DataSource dataSource;

    public LiterAluraApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Prueba de conexión al iniciar
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("✅ Conexión a SQLite OK: " + conn.getMetaData().getURL());
        }
        System.out.println("📁 La base quedará en: src/main/resources/db/literalura.db");
    }
}
