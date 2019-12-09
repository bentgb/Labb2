import org.eclipse.sisu.Parameters;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorTest {

private Calculator calculator;


 @BeforeEach
 public void setUp(){
     calculator = new Calculator(100, 20);
      }

@Test
@Order(1)
@DisplayName("Checking if the getter for first parameter is working")
    void testingGetter1(){
    Assertions.assertEquals(100, calculator.getA());
}

@Test
@DisplayName("Checking if the getter for the second parameter is working")
@Order(2)
     void testingGetter2(){
     Assertions.assertEquals(20, calculator.getB());
}
 @Test
      void testingAddition(){
     Assertions.assertEquals(120, calculator.addition(100,20));
 }

 @Test
     void testingSubtraction(){
     Assertions.assertEquals(80, calculator.subtraction(100,20));

 }

 @Test
 @DisplayName("Testing if the arrays are equal, both in length and in each individual elements they have")
    void testingArraySize(){
     int [] newArray = {1,2,3,4,5,6};
     Assertions.assertArrayEquals(newArray, calculator.getThisIsAnArray());
      }

    @Test
    @DisplayName("Testing if exceptions work")
    void testingDivisionWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.division(10.0, 0.0);
        }, "Division by 0 should throw IllegalArgumentException");
    }

    @Test
    @DisplayName("Testing the private method through a public method")
    void testingPrivateMethod(){
     Assertions.assertEquals(1100, calculator.callingThePrivateMethod(11,10));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        assertTrue(calculator.isOdd(number));
    }


    @AfterEach
    void setDown() {
        calculator = null;
            }
}