// Solution by: Tyler Weatherby
// 4. Median of Two Sorted Arrays
// https://leetcode.com/problems/median-of-two-sorted-arrays/

/*  
    My Notes: There's probably a more efficient way to do this.
    For now, I decided to implement a way where we combine both arrays
    being passed through, and then sort the resulting array.
    We then find the median based on the length, and a few special cases.
*/

package LeetCode;
import java.util.Arrays;
public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        // Get the length of both arrays.
        int length = nums1.length + nums2.length;
        // Create a new array with the designated length.
        int[] result = new int[length];
        // Push (really, copy) both arrays onto the new array, so we have one array.
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        // Run a sort on the result array.
        Arrays.sort(result);
        if(length % 2 == 0)
        {
            // If the length is even we need to divide two numers to get the median
            double test = ((double)(result[length / 2] + result[(length / 2) - 1]) / 2);
            return test;
        }
        else if(length == 3)
        {
            // Special case, if the length is three, return the second element.
            return result[1];
        }
        else
        {
            if(length == 1)
            {
                // Special case, if there is one element, return that element.
                return result[0];
            }
            else
            {
                // If the result is odd, return the length/2 for the middle element.
                return result[(length / 2)];
            }
        }   
    }
}
