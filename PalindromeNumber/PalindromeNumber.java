// Solution by: Tyler Weatherby
// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number

package LeetCode;
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Specified special case example: -121 --> 121- therefore false.
        // So anything in the negative range is automatically false.
        if(x < 0)
        {
            return false;
        }
        // Use the ReverseInteger solution I posted earlier, a palindrome number equals itself in reverse.
        else if(x == reverse(x))
        {
            return true;
        }
        // If the above isn't true, return false.
        else
        {
        return false;
        }
    }
    public int reverse(int x)
    {
        long result = 0;
        int tryThis = 0;
        while (x != 0)
        {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return (int)result;
    }
}
