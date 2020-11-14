package com.example.springbootmongo.config;


import com.example.springbootmongo.document.Users;
import com.example.springbootmongo.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner (UsersRepository usersRepository){

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
              usersRepository.save(new Users(1, "Victor", "The ViVi", 8000L));
              usersRepository.save(new Users(2, "John", "The ViVi", 3000L));
            }
        };
    }
}
