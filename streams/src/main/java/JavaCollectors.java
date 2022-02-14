
import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("********TOCOLLECTION********"); //this is more customized
        //toCollection(Supplier) : is used to create a collection using collector
        //collection is a terminal operator
        //ArrayList::new means new arraylist. we are creating new arraylist, we are putting everything in that arraylist
        List<Integer> numberSet = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list
        System.out.println("********TOLIST********"); //it mostly used, it puts into list
        List<Integer> numbersList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        System.out.println(numbersList2);

        //toSet() returns collector interface that gathers input data into a new set
        System.out.println("********TOSET********"); //it mostly used, it puts into list
        Set<Integer> numbersSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());

        System.out.println(numbersSet2);

        //toMap(Function, Function) : returns a Collector interface that gathers data input into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);

        //counting() : returns a Collector that counts the number of the elements
        System.out.println("********COUNTING********");
        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //summingInt(ToIntFunction) : returns a Collector that produces the sum of a integer-valued func
        System.out.println("********SUMMINGINT()********");
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //averagingInt(ToIntFunction) - returns the average of the Integers pasted values
        System.out.println("----averagingInt()-------");
        Double average = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(average);

        //joining() - is used to join varios elements of a charecter or  string array into a single string object
        System.out.println("----joining()-------");
        List<String> courses =  Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println(str);


        //partitioningBy() : is used to partition a stream of objects(or set of elements) based on a given predicate
        System.out.println("********PARTITIONINGBY()********");  //taking predicate and grouping by true and false
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy() : is used for grouping objects by some property and storing results in a map instance
        System.out.println("********GROUPINGBY()********"); //you are giving how to group, by which category
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);






    }
}
