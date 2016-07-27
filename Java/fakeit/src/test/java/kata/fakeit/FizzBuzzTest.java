package kata.fakeit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FizzBuzzTest 
    extends TestCase
{
    
    public void test()
    {
        String expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
        assertEquals(expected ,FizzBuzz.print(20));
    }
}
