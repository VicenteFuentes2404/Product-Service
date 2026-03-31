package com.fullstack.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter                //utlizamos anotaciones lombok que  permite ahorrarnos lineas de código
@AllArgsConstructor    //generando automaticamente constructor, getters y setter
@NoArgsConstructor
@Data
public class Product {
    private Long id;
    private String nombre;
    private Double precio;


    
}
