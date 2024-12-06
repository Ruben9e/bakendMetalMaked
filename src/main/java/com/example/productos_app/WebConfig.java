package com.example.productos_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // Indica que esta clase es una clase de configuración de Spring
public class WebConfig implements WebMvcConfigurer {

    // Método para configurar CORS
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite solicitudes de CORS para los endpoints
        registry.addMapping("/productos")  // Ruta a la que se permitirá acceso
                .allowedOrigins("http://localhost:4200")  // Frontend (Angular) que está corriendo en el puerto 4200
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos HTTP que permitimos
                .allowedHeaders("*")  // Permite cualquier encabezado
                .allowCredentials(true);  // Permite el envío de cookies si es necesario
    }
}
