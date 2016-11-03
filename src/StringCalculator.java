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

        for (int number: numbersArray) {

            result+=number;

        }

        return result;}
    }
