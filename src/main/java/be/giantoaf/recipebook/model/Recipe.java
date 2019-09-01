package be.giantoaf.recipebook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Lob
    private String description;
    @Lob
    private String steps;
    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "Recipe_Category",
            joinColumns = {
                    @JoinColumn(name = "recipe_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private List<Category> categories = new ArrayList<>();

}
