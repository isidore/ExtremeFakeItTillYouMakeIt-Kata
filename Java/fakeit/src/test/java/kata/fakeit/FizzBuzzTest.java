package kata.fakeit;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest
{
    @Test
    public void test()
    {
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
       assertEquals(expected ,FizzBuzz.print(20));
    }
}
