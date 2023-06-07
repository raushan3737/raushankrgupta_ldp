package com.zemoso.annotationdemo;

import com.zemoso.annotationdemo.service.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 @Configuration: Spring Configuration annotation indicates that the class has @Bean definition methods.
 So Spring container can process the class and generate Spring Beans to be used in the application.

 @ComponentScan: have to provide the package to scan & find all the classes which have @Component annotation and register it to the Spring container
*/

@Configuration
@ComponentScan("com.zemoso.annotationdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortunesService() {
        return new SadFortuneService();
    }

    // Define bean for our swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortunesService());
    }
}
