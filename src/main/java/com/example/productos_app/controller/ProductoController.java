package com.example.productos_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductoController {

    @GetMapping("/productos")
    public Map<String, Object> getProductos() {
        // Simulación de datos, equivalente a tu backend en Node.js
        List<Map<String, Object>> productos = List.of(
                Map.of("id", 1, "nombre", "estante cuadrado", "precio", 150000, "link", "https://industriascruzmr.com/wp-content/uploads/2021/10/estante-metal-madera-1.jpeg"),
                Map.of("id", 2, "nombre", "estante escalonado", "precio", 250000, "link", "https://i.pinimg.com/236x/6b/c1/10/6bc110d082cf5100bd01b433b54d94d3.jpg"),
                Map.of("id", 3, "nombre", "repisa", "precio", 80000, "link", "https://i.etsystatic.com/7888973/r/il/e94036/4091297358/il_570xN.4091297358_o5en.jpg"),
                Map.of("id", 4, "nombre", "mesa", "precio", 300000, "link", "https://ambiant.com.mx/cdn/shop/products/Mesa-metalica-Nova-150-negro.jpg?v=1598477362&width=1000"),
                Map.of("id", 5, "nombre", "escritorio", "precio", 250000, "link", "https://http2.mlstatic.com/D_NQ_NP_895258-MCO80313577621_102024-O.webp")
        );

        return Map.of("data", productos);
    }
}
