package homework.task7;

/**
 * 1. Zdefiniuj klasy implementujące interfejs Ingredient, która opisuje wagę i kaloryczność składnika dania
 *    - Cheese
 *    - Tomato
 *    - Cake
 *    - Salt
 *    Przy definicji wzoruj się na klasie Egg, możesz też samodzielnie dodać dodakowe pole, jak np. smak, czy koloryczność jednostkową podawaną w konstruktorze
 * 2. Zdefiniuj klasę Dish też implementującą interfejs Ingredient,
 *    - z polem w postaci tablicy obiektów implementujących Ingredient
 *    - z konstruktorem przyjmujący tablicę takich obiektów np. Dish(new Ingredients[]{chees, cake}), gdzie cheese i cake są obiektami klas Cheese i Cake
 *    - z metodami interfejsowymi zwracającymi wagę i kaloryczność całego dania
 * 3. Stwórz kilka różnych obiektów klasy Dish, z różnymi składnikami i przetestuj czy poprawnie działają metody klasy
 * 4. Stwórz obiekt klasy Dish, w którym jednym ze składników jest inne danie.
 * Dla chętnych i ambitnych
 * 5. Zrób całe zadanie uwzględniając cenę składników i całego dania, przy czym nie każdy składnik musi mieć cenę (np. Salt), ale każde danie cenę posiada
 * Wskazówki
 * 1. Zdefiniuj osobno interfejs Valuable z metodą abstrakcyjną zwracająca cenę składnika, oraz interfejs ValuableIngredient łączący oba interfejsy
 * 2. Przy obliczaniu ceny dania należy operatorem instanceof wykryć, który składnik ma cenę
 */
public class Task07 {
    public static void main(String[] args) {

        Egg egg = new Egg("egg", 0.15);

        System.out.println(egg.weight());
        System.out.println(egg.calories());
        System.out.println(egg.toString());
        System.out.println();

        Cheese cheese = new Cheese(0.5, "cheese");

        System.out.println(cheese.weight());
        System.out.println(cheese.calories());
        System.out.println(cheese.toString());
        System.out.println();

        Tomato tomato = new Tomato(1, "tomato");

        System.out.println(tomato.weight());
        System.out.println(tomato.calories());
        System.out.println(tomato.toString());
        System.out.println();

        Cake cake = new Cake(5.2, "cake");

        System.out.println(cake.weight());
        System.out.println(cake.calories());
        System.out.println(cake.toString());
        System.out.println();

        Salt salt = new Salt(2.4, "salt");

        System.out.println(salt.weight());
        System.out.println(salt.calories());
        System.out.println(salt.toString());
        System.out.println();

        Ingredient[] firstDish = new Ingredient[]{egg, cheese};
        Ingredient[] secondDish = new Ingredient[]{cheese, tomato, salt};
        Ingredient[] thirdDish = new Ingredient[]{cake};

        Dish breakfast = new Dish(firstDish);

        System.out.println(breakfast.weight());
        System.out.println(breakfast.calories());
        System.out.println();

        Dish dinner = new Dish(secondDish);

        System.out.println(dinner.weight());
        System.out.println(dinner.calories());
        System.out.println();

        Dish dessert = new Dish(thirdDish);

        System.out.println(dessert.weight());
        System.out.println(dessert.calories());
        System.out.println();

        /*Dish allDish = new Dish(fourthDish);

        System.out.println(allDish.weight());
        System.out.println(allDish.calories());*/

        System.out.println(breakfast.price());
    }
}
