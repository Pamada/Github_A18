package com.jdk.explore.java.github_a18;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.jdk.explore.java.github_a18")
@EnableJpaRepositories(basePackages = "com.jdk.explore.java.github_a18.repository")
public class SpringbootmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmvcApplication.class, args);
    }
}