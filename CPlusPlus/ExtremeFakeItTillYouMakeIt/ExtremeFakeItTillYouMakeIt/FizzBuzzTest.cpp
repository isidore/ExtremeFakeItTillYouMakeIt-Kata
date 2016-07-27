#include <gtest/gtest.h>

#include "GildedRose.h"

TEST(GildedRoseTest, Foo) {
	std::string expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
	EXPECT_EQ( expected, FizzBuzz.Print( 20 ) );
}
