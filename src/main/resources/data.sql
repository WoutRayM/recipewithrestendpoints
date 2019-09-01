insert into Recipe(name, description, steps) values ('Mushrooms Chicken Piccata', 'Tasty dish', 'Do some hard work')

insert into Ingredient(name, units, recipe_id) values ('mushroom', 4, 1)
insert into ingredient(name, units, recipe_id) values ('milk', 100, 1)
insert into ingredient(name, units, recipe_id) values ('egg', 1, 1)

insert into Category(name) values ('Mexican')
insert into Category(name) values ('Japanese')
insert into Category(name) values ('Italian')

insert into Recipe_Category(recipe_id, category_id) values (1, 1)
insert into Recipe_Category(recipe_id, category_id) values (1, 2)
insert into Recipe_Category(recipe_id, category_id) values (1, 3)