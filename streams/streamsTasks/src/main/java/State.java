import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class State {

  //  private List<String> states = new ArrayList<>();


    private List<String> cities = new ArrayList<>();

    public void addCity(String city) {
        cities.add(city);


    }
    public List<String> getCities() {
        return this.cities;
    }



}
