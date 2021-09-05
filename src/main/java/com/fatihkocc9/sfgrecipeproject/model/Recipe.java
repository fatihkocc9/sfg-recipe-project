package com.fatihkocc9.sfgrecipeproject.model;

import java.util.Collection;

public class Recipe {

  private int prepTime;
  private int cookTime;
  private int servings;
  private String source;
  private String url;
  private String directions;
  private Byte[] image;

  private Difficulty difficulty;

  private Notes notes;

  private Collection<Ingredient> ingredients;

  private Collection<Category> categories;
}
