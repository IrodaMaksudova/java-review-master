import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareOfNumbers {

        public static void main(String[] args) {


            //Creating Stream from Collection
            List<Integer> num = Arrays.asList(1,2,3,4,5);

            List<Integer> result = num.stream()
                    .map(number -> number*number)
                    .collect(Collectors.toList());
                    //collect is terminal operator, which terminates the stream
            System.out.println(result);

        }
    }


