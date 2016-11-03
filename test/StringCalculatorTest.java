/**
 * Created by employee on 11/3/16.
 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;


public class StringCalculatorTest {

    @Test
    public void whenAnyNumbersIsUsedCalculatorMustReturnTheirSum(){
     assertThat(1+2+3+4+5, equalTo(StringCalculator.add("1,2,3,4,5")));
    }

    @Test
    public void ifTwoNumbersAreUsedThenNoExceptionIsThrown(){
        StringCalculator.add("1,2");

    }
    @Test (expected = RuntimeException.class)
    public void ifInputIsNotANumber( ){
        StringCalculator.add("a,2");
    }
    @Test
    public void ifStringIsEmplyCalculatorReturnsZero(){
        assertThat(0,equalTo(StringCalculator.add("")));
    }

    @Test
    public void whenOneNumberWasInputedReturnItself(){
        assertThat(9, equalTo(StringCalculator.add("9")));
    }

    @Test
    public void whenTwoNumbersWereInputedReturnSumOfThem(){
        assertThat(9+1, equalTo(StringCalculator.add("9,1")));
    }

    @Test
    public void whenNewLineWasInputedBetweenNumbersCalcMustReturnTheirSum(){
        assertThat(1+2+3, equalTo(StringCalculator.add("1,2n3")));
    }

}
