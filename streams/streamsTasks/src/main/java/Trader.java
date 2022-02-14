import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trader {

    //every trader has a transaction, has a relationship
    private String name;
    private String city;
}
