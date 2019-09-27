// Solution by: Tyler Weatherby
// 628. Maximum Product of Three Numbers
// https://leetcode.com/problems/maximum-product-of-three-numbers/

package LeetCode;
import java.util.Arrays; 
import java.util.Collections; 
public class MaxProductThreeNumbers
{
    class Solution
    {
        public int maximumProduct(int[] nums)
        {
            // Sort the array we passed in to start.
            Arrays.sort(nums);
            int result = 0;
            /*
            Using math.max, we attempt to find the solution with the sorted
            array. The largest number will either be  (-x * -y * z) or
            (x * y * z). 
            */
            result = Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
            return result;
        }
    }
}
