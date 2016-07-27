defmodule FakeItTillYouMakeItTest do
  use ExUnit.Case
  doctest FakeItTillYouMakeIt

  test "fizzbuzz" do
    expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
    assert expected == FizzBuzz.print(20)
  end
end
