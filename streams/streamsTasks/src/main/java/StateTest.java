import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx = new State();
        va.addCity("Dallas");
        va.addCity("Plano");
        va.addCity("Austin");
        va.addCity("Houston");

        List<State> list = Arrays.asList(va, tx);

   //     list.stream().map(state -> state.getCities()).forEach(System.out::println);
        //instead of above we can do below

        list.stream()
                        .map(state -> state.getCities())
                                .flatMap(List::stream)
                                        .forEach(System.out::println);



        //prints: [Boston, Sharon, Franklin]
//        MAstate.readAll()
//                .map(State::getCities)
//                .forEach(System.out::println);
//
//        //prints cities in line:
//        //Boston
//        //Sharon
//        //Franklin
//        MAstate.readAll()
//                .flatMap(state -> state.getCities().stream())
//                .forEach(System.out::println);
//
//        //also like above
//        RIstate.readAll()
//                        .map(State::getCities)
//                                .flatMap(List::stream)
//                                        .forEach((System.out::println));
    }
}
