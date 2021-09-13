package com.fatihkocc9.sfgrecipeproject.repository;

import com.fatihkocc9.sfgrecipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
