package com.example.mwtrade_web_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
        //(exclude = DataSourceAutoConfiguration.class)
@EnableJpaRepositories("com.example.mwtrade_web_api.Repositories")
public class MwTradeWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MwTradeWebApiApplication.class, args);
    }

}
