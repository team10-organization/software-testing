
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 작성
    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(473,684);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertThat(result, is(1157)); // changed by 마성호
        System.out.println("The result is " + result);
    }

    //빼기 테스트 작성
    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(65,28);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertTrue(result == 37); // changed by 마성호
        System.out.println("The result is " + result);
    }

    //곱하기 테스트 작성
    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(67, 645);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertThat(result, is(43215)); // changed by 마성호
        System.out.println("The result is " + result);
    }

    //나누기 테스트 작성
    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(169,13);
        /* 이곳에 테스트 코드를 작성하세요. */
        assertTrue(result == 13); //changed by 마성호
        System.out.println("The result is " + result);
    }
}