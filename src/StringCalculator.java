import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/3/16.
 */
public class StringCalculator {
    public static final void add(final String numbers){
        List<Integer> numbersArray = new ArrayList<>();

        for (String number: numbers.split(",")){

            numbersArray.add(Integer.parseInt(number));
            }
        if (numbersArray.size()>2){
            throw new RuntimeException("no more than 2 numbers are allowed");
        }



    }
}
