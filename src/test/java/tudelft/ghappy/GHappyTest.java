package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "str={0}, result={1}")
    @CsvSource({ "g,false", "xxggxx,true", "xxgxx,false", "xxggyygxx,false" })
    public void totalIsTooBig(String str,  boolean expectedResult) {

        GHappy ghap = new GHappy();

        boolean result = ghap.gHappy(str);

        Assertions.assertEquals(expectedResult, result);
    }

}
