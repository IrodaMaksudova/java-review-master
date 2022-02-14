import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Employee {

    private int empID;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumber; // employee might have more than phone number
}
