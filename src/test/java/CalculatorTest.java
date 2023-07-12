import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        // this creates a new calculator before each test
        Calculator calculator = new Calculator();
    }

    // every test is a void and the name of the test should always represent what is being tested
    @Test
    public void canAddNumbers(){
//        Given
//        Calculator calculator = new Calculator();
//        When
        int actual = calculator.add(5, 6);
//        Then
        int expected = 11;

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSubtractNumbers(){
//        given
//        Calculator calculator = new Calculator();
//        when
        int actual = calculator.subtract(5, 6);
//        then
        int expected = -1;

        assertThat(actual).isEqualTo(expected);
    }




}
