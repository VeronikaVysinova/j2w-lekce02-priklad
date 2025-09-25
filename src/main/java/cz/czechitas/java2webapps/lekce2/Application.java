package cz.czechitas.java2webapps.lekce2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hlavní třída, která spouští celou aplikaci pomocí Spring Boot.
 */
@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        logger.info("Aplikace běží na adrese: http://localhost:{}", applicationContext.getEnvironment().getProperty("local.server.port")); // abych věděla, na jaké adrese se mi to zobrazí a nemusela si pamatovat adresu, v konzoli se zobrazí
    }

}
