/**
 * Created by employee on 11/3/16.
 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class StringCalculatorTest {

    @Test (expected = RuntimeException.class)
    public void whenMoreThan2NumbersAreUsedThenExceptionIsThrown(){
        StringCalculator.add("1,2,3");
    }

    @Test
    public void ifTwoNumbersAreUsedThenNoExceptionIsThrown(){
        StringCalculator.add("1,2");

    }
    @Test (expected = RuntimeException.class)
    public void ifInputIsNotANumber( ){
        StringCalculator.add("a,2");
    }
}
