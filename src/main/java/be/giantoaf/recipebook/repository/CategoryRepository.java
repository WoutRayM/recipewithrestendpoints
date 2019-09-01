package be.giantoaf.recipebook.repository;

import be.giantoaf.recipebook.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
