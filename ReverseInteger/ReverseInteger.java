// Solution by: Tyler Weatherby
// 7. Reverse Integer
// https://leetcode.com/problems/reverse-integer/

package LeetCode;
public class ReverseInteger {
     public static int reverse(int x)
     {
          // result needs to be type long incase an integer > [2^31 - 1 or -2^31] was passed
          long result = 0;
          
          // Using just arithmetic operators, reverse the integer passed through.
          while (x != 0)
          {
               result *= 10;
               result += x % 10;
               x /= 10;
          }
          // Check to see if our long is within integer range. [2^31 - 1 or -2^31]
          if (result > (Math.pow(2, 31) - 1) || result < (Math.pow(2, 31) * -1))
          {
               // Specified if overflowed to return 0.
               return 0;
          }
          // Convert long to int
          return (int)result;
    }
}
