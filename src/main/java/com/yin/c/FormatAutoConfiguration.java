package com.yin.c;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FormatAutoConfiguration {

    @Bean
    public JsonFormat FormatJson() {
        return new JsonFormat();
    }
}
