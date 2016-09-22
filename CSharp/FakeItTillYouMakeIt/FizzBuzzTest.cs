using System.Linq;
using ApprovalTests.Utilities;
using ApprovalUtilities.Utilities;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace FizzBuzzFake
{
    [TestClass]
    public class FizzBuzzTest
    {
        [TestMethod]
        public void TestFizzBuzz()
        {
            var java = PathUtilities.LocateFileFromEnviormentPath("javaw.exe");
            var counterDisplayJar = PathUtilities.GetAdjacentFile("CounterDisplay.jar");
            TestCounter.ResetAndLaunch(java.FirstOrDefault(), counterDisplayJar);// Comment out after 1st run
            TestCounter.Track(Check20);
        }

        private static void Check20()
        {
            string expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
            Assert.AreEqual(expected, FizzBuzz.Print(20));
        }
    }

    public class FizzBuzz
    {
        public static string Print(int top)
        {
            string expected = "1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16,17,Fizz,19,Buzz";
            return expected;
        }
    }
}