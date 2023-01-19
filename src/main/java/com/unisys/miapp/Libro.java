package com.unisys.miapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
    public class Libro {
        private String titulo;
        private String autor;
        private String editorial;
}
