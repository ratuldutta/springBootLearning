package com.ratul.bookstore.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {
	private static final Logger LOG = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(BookRepository repository) {
		return args -> {
			LOG.info("Preloading " + repository.save(new Book("Story", "A Jana")));
			LOG.info("Preloading " + repository.save(new Book("Sci Fi", "B Prasad")));
		};
	}
}