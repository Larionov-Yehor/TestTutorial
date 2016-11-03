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
    @Test
    public void whenDelimiterIsInStringIsUsedForSeparationCalcMustReturnSum(){
        assertThat(1+3+4, equalTo(StringCalculator.add("//;n1;3;4")));
    }

    @Test (expected = RuntimeException.class)
    public void whenNegativeNumbersAreInputedMustThrowRuntimeException(){
        StringCalculator.add("3,4,5,-7,1");
    }

    @Test
    public void exceptionCausedByNegativeNumbersMustBeCorrect(){
        String correctMessage = "no negatives are allowed";
        String exceptionMessage =null;
        try{
            StringCalculator.add("1,2,-3");
        }catch (RuntimeException r){
           exceptionMessage =r.getMessage();
        }
        assertThat(correctMessage,equalTo(exceptionMessage));
    }

    @Test
    public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
        assertThat(1+2, equalTo(StringCalculator.add("1,2,1001")));
    }

    
}
