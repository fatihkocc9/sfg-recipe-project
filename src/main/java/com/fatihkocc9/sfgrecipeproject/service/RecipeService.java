package com.fatihkocc9.sfgrecipeproject.service;

import com.fatihkocc9.sfgrecipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

  Set<Recipe> getRecipes();
}
