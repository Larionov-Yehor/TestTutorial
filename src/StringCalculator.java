import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/3/16.
 */
public class StringCalculator {
    public static int add(String numbers){
        int result=0;

        List<Integer> numbersArray = new ArrayList<>();

        for (String number: numbers.split(",")){
            if(number.isEmpty()){
                result=0;
                break;
            }

            numbersArray.add(Integer.parseInt(number));

            }

        if (numbersArray.size()>2){
            throw new RuntimeException("no more than 2 numbers are allowed");
            }

        return result;}
    }
