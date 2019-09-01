package be.giantoaf.recipebook.bootstrap;

import be.giantoaf.recipebook.model.Category;
import be.giantoaf.recipebook.model.Recipe;
import be.giantoaf.recipebook.repository.CategoryRepository;
import be.giantoaf.recipebook.repository.IngredientRepository;
import be.giantoaf.recipebook.repository.RecipeRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RecipeBootstrap implements ApplicationRunner {

    private final CategoryRepository categoryRepository;
    private final IngredientRepository ingredientRepository;
    private final RecipeRepository recipeRepository;

    public RecipeBootstrap(CategoryRepository categoryRepository, IngredientRepository ingredientRepository, RecipeRepository recipeRepository) {
        this.categoryRepository = categoryRepository;
        this.ingredientRepository = ingredientRepository;
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Category category = new Category("Diet");
        categoryRepository.save(category);
    }

}
