package com.fatihkocc9;

import com.fatihkocc9.sfgrecipeproject.domain.Category;
import com.fatihkocc9.sfgrecipeproject.domain.UnitOfMeasure;
import com.fatihkocc9.sfgrecipeproject.repository.CategoryRepository;
import com.fatihkocc9.sfgrecipeproject.repository.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

  private CategoryRepository categoryRepository;
  private UnitOfMeasureRepository unitOfMeasureRepository;

  public IndexController(
      CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
    this.categoryRepository = categoryRepository;
    this.unitOfMeasureRepository = unitOfMeasureRepository;
  }

  @RequestMapping({"", "/"})
  public String getIndexPage() {

    Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
    Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");

    System.out.println("Category is: " + categoryOptional.get().getId());
    System.out.println("Unit of measure is: " + unitOfMeasure.get().getId());

    return "index";
  }
}
