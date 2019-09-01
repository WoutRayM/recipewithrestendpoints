package be.giantoaf.recipebook.service;

import be.giantoaf.recipebook.model.Category;
import be.giantoaf.recipebook.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CategoryServiceTest {

    @Mock
    CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryService categoryService;

    @Test
    void categoryServiceGetAllTest() {
        Category category = new Category("Mexican");
        List<Category> categories = Arrays.asList(category);
        given(categoryRepository.findAll()).willReturn(categories);
        List<Category> categoriesFound = categoryService.getAllCategories();
        assertThat(categoriesFound).hasSize(1);
    }

}
