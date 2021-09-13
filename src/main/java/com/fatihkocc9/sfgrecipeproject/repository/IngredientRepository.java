package com.fatihkocc9.sfgrecipeproject.repository;

import com.fatihkocc9.sfgrecipeproject.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {}
