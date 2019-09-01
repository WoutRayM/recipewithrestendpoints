package be.giantoaf.recipebook.repository;

import be.giantoaf.recipebook.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
