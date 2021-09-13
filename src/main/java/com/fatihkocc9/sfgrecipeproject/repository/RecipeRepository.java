package com.fatihkocc9.sfgrecipeproject.repository;

import com.fatihkocc9.sfgrecipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {}
