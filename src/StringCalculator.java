import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/3/16.
 */
public class StringCalculator {

    public static int add(String numbers) {
        String delimiter = ",|n";
        String numbersWithoutDelimiter = numbers;
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("//") + 2;
            delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
            numbersWithoutDelimiter = numbers.substring(numbers.indexOf("n") + 1);
        }
        return add(numbersWithoutDelimiter, delimiter);
    }

    private static int add(String numbers, String delimiter) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(delimiter);
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                if(Integer.parseInt(number)<0){
                    throw new RuntimeException("no negatives are allowed");
                }
               if(Integer.parseInt(number)>1000){
               continue;}
            }
            returnValue += Integer.parseInt(number.trim());

        }
        return returnValue;
    }
}