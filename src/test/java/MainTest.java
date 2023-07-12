import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

// we do not need a main method to run a test unless we want to write something that needs to be interacted with
//      @Test
//      public void myFirstTest(){
//       }

    @Test
    public void myFirstTest(){
//      BDD
//      behaviour driven development

//      Given.. (Arrange)
        String input = "HELLO";
//      When.. (Act)
        String actual = input.toLowerCase();
//      Then.. (Assert)
        String expected = "hello";

        assertThat(actual).isEqualTo(expected);
    }


}
