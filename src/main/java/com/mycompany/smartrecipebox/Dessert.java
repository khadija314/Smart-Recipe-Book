/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartrecipebox;

/**
 *
 * @author Khadija
 */
public class Dessert extends Recipe {
    private boolean isSweet;

    public Dessert(String name, String[] ingredients, String instructions, boolean isSweet) {
        super(name, ingredients, instructions);
        this.isSweet = isSweet;
    }

    @Override
    public void displayRecipe() {
        System.out.println("Dessert: " + name + ", Sweet: " + isSweet);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Dessert Recipe\n");
        builder.append("Name: ").append(name).append("\n");
        builder.append("Sweet: ").append(isSweet).append("\n");
        builder.append("Ingredients:\n");
        for (String ing : ingredients) {
            builder.append("- ").append(ing).append("\n");
        }
        builder.append("Instructions: ").append(instructions).append("\n");
        return builder.toString();
    }
}
