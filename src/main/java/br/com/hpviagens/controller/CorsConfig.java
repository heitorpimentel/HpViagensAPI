package br.com.hpviagens.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/cliente/**") // Define o caminho da API que será acessado
        registry.addMapping("/viagem/**");
        registry.addMapping("/pagamento/**");
        registry.addMapping("/reserva/**");
        .allowedOrigins("https://hpviagens.vercel.app")
        .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
