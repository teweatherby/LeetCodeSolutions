// Solution by: Tyler Weatherby
// 1108. Defanging an IP Address
// https://leetcode.com/problems/defanging-an-ip-address/

package LeetCode;
public class defangIPaddr {
    public static String defangIPaddr(String address)
    {
        // The solution was trivial.
        return address.replace(".", "[.]");
    }
}
