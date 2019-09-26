/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author tweatherby
 */
public class ReverseInt {
     public static int reverse(int x)
     {
        long result = 0;
        int tryThis = 0;
        while (x != 0)
        {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        if (result > (Math.pow(2, 31) - 1) || result < (Math.pow(2, 31) * -1))
        {
             return 0;
        }
        return (int)result;
    }
}