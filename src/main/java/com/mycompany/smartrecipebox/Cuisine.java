/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartrecipebox;

/**
 *
 * @author Khadija
 */
public class Cuisine extends Recipe {
    private String region;

    public Cuisine(String name, String[] ingredients, String instructions, String region) {
        super(name, ingredients, instructions);
        this.region = region;
    }

    @Override
    public void displayRecipe() {
        System.out.println("Cuisine: " + name + ", Region: " + region);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cuisine Recipe\n");
        builder.append("Name: ").append(name).append("\n");
        builder.append("Region: ").append(region).append("\n");
        builder.append("Ingredients:\n");
        for (String ing : ingredients) {
            builder.append("- ").append(ing).append("\n");
        }
        builder.append("Instructions: ").append(instructions).append("\n");
        return builder.toString();
    }
}
