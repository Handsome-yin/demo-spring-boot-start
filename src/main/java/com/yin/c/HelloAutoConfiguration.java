package com.yin.c;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FormatAutoConfiguration.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public TestTemplate testTemplate(JsonFormat JsonFormat) {
        return new TestTemplate(JsonFormat);
    }
}
