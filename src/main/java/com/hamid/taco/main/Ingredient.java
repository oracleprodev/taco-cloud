package com.hamid.taco.main;

import lombok.Data;

@Data
public class Ingredient {

    private Long id;
    private String name;
    private Type type;


    public enum Type {
        WRAP,
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE
    }
}
