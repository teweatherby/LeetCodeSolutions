// Solution by: Tyler Weatherby
// 65. Valid Number
// https://leetcode.com/problems/valid-number/

/*
My notes: While this was listed as "hard" I figured there was an easy
way to achieve this using try/catch. However, when submitting my solution,
Java recognizes 'f' & 'd' as part of a valid number. For the purposes of this
exercise, these were not acceptable criteria. Luckily, Java only has a couple
of these formatters, so excluding them (always at the end of the number) was
easy.
*/

package LeetCode;
import java.util.*;
import java.lang.*;
public class ValidNumber
{
    public boolean isNumber(String s)
    {
        // Exclude the valid number formatters, only at the end of the number.
        if(s.charAt(s.length() - 1) == 'f' || s.charAt(s.length() - 1) == 'd'
        || s.charAt(s.length() - 1) == 'F' || s.charAt(s.length() - 1) == 'D')
        {
            return false;
        }
        double result = 0;
        try
        {
            result = Double.parseDouble(s);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
}
