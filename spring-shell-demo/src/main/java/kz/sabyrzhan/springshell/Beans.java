package kz.sabyrzhan.springshell;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
