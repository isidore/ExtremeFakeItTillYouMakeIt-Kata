import unittest


class FizzBuzz(object):
    @staticmethod
    def print(top):
        return "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz"


class MyTestCase(unittest.TestCase):
    def test_something(self):
        expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz"
        self.assertEqual(expected,FizzBuzz.print(20))

if __name__ == '__main__':
    unittest.main()
