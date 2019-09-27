package LeetCode;
public class IntegerToRoman {
        // Place integer values in the same index as the equivalent 
        // roman values.
        private static int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        private static String[] chars= {"M" ,"CM" ,"D" ,"CD" ,"C" ,"XC" ,"L" ,
                                        "XL" ,"X" ,"IX" ,"V" ,"IV" ,"I"};
    public static String intToRoman(int number)
    {
        String result = new String();
        int counter = 0;
        /* While our number doesn't equal zero, and while our counter isn't
           equal to the length of the array nums we will say,
           if the number is greater than nums[index] then add the corresponding
           characters to the result string, and subtract the nums[index] from
           the number we're manipulating.
        */
        while(number != 0 && counter != nums.length)
        {
            if(number >= nums[counter])
            {
                result += chars[counter];
                number -= nums[counter];
            }
            // If the number is not greater or equal to, then increment the
            // counter to get to the next index for the next iteration.
            else
            {
                counter++;
            }
        }
        return result;
    }
}
