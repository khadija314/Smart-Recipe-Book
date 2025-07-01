/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartrecipebox;

/**
 *
 * @author Khadija
 */
public abstract class Recipe {
    protected String name;
    protected String[] ingredients;
    protected String instructions;

    public Recipe(String name, String[] ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public abstract void displayRecipe();

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }
    public String getInstructions() {
        return instructions;
    }

    @Override
    public abstract String toString();
}

