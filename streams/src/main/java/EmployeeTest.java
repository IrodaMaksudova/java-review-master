import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {


//        Print All Email
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);

//        EmployeeData.readAll()
//                .flatMap(p -> p.getEmpPhoneNumber().stream())
//                .forEach(System.out::println);
    }
}
