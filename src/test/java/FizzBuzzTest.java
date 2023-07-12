import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {


    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp(){
       fizzBuzz = new FizzBuzz();
    }
// Test objectives
// 1. Given a number, our function should return fizz if number is divisible by 3;
// 2. Given a number, our function should return buzz if number is divisible by 5;
// 3. Given a number, our function should return fizzbuss if number is divisible by 3 and 5;

// Tests
    // 1. Given a number, our function should return fizz if number is divisible by 3;
    @Test
    public void canReturnFizz(){
    //  given
    //  when
        String result = fizzBuzz.getFizzBuzz(3);
    //  then
        String expected = "Fizz";
        assertThat(result).isEqualTo(expected);
    }


    // 2. Given a number, our function should return buzz if number is divisible by 5;
    @Test
    public void canReturnBuzz(){
    //  given
    //  when
        String result = fizzBuzz.getFizzBuzz(5);
    //  then
        String expected = "Buzz";
        assertThat(result).isEqualTo(expected);

    }


    // 3. Given a number, our function should return fizzbuss if number is divisible by 3 and 5;
    @Test
    public void canReturnFizzBuzz(){
    //  given
    //  when
        String result = fizzBuzz.getFizzBuzz(15);
    //  then
        String expected = "FizzBuzz";
        assertThat(result).isEqualTo(expected);

    }


    // 4. Given a number, our function should return the number if is not divisible by 3 or 5;
    @Test
    public void canReturnNumber(){
    //  given
    //  when
    String result = fizzBuzz.getFizzBuzz(1);
    //  then
    String expected = "1";
    assertThat(result).isEqualTo(expected);

    }

}


