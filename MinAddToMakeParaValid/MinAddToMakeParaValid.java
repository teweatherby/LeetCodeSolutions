// Solution by: Tyler Weatherby
// 921. Minimum Add to Make Parentheses Valid
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

package LeetCode;
class MinAddToMakeParaValid
{
    public int minAddToMakeValid(String S)
    {
        // Count '('
        int lPara = 0;
        // Count ')'
        int rPara = 0;
        for(int x = 0; x < S.length(); x++)
        {
            // count paraenthesis on the left.
            if(S.charAt(x) == '(')
            {
                lPara++;
            }
            // count paraentesis on the right.
            else if(S.charAt(x) == ')')
            {
                rPara++;
                // If there's a left paraenthesis, two characters make valid enclosures.
                if(lPara > 0)
                {
                    lPara--;
                    rPara--;
                }
            }
        } 
        return lPara + rPara;
    }
}
