import java.util.Arrays;
import java.util.stream.Stream;

    public class EmployeeData {

        public static Stream<Employee> readAll() {
            return Stream.of(
                    new Employee(100,"Mike","mike@home.com", Arrays.asList("2034546655","4018889999")),
                    new Employee(100,"Tim","tim@home.com", Arrays.asList("567880033","9088889999")),
                    new Employee(100,"Ben","ben@home.com", Arrays.asList("6174546655","5088889999"))
            );
        }
}
