
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTest {
    public static void main(String[] args) {

    //Print all dish's name that has less 400 calories

        //        System.out.println("FILTER");
//        menu.stream()
//                .filter(dish -> dish.getCalories()>400)
//                .forEach(System.out::println);

        DishData.getAll().stream()
                        .map(Dish::getName)
                                .forEach(System.out::println);


//        menu.stream()
//                .map(dish -> dish.getName().length())
//  //              .map(String::length)
//                .forEach(System.out::println);

        //Print the length of the name of the dish
        //Source
        DishData.getAll().stream()
                .map(Dish::getName)
                .map((String::length))
                .forEach(System.out::println);

        //Print Three High Caloric dish name(>300)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //Print all dish names that are below 400 calories sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
