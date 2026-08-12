# 3. Longest Substring Without Repeating Characters

Given a string `s`, find the length of the longest <abbr title=" A substring is a contiguous non-empty sequence of characters within a string.">substring</abbr> without duplicate characters.



#### Example 1:

>**Input:** s = "abcabcbb"  
**Output:** 3  
**Explanation:** The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

#### Example 2:

>**Input:** s = "bbbbb"  
**Output:** 1  
**Explanation:** The answer is "b", with the length of 1.

#### Example 3:

>**Input:** s = "pwwkew"  
**Output:** 3  
**Explanation:** The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

##### Constraints:

- 0 <= s.length <= 10<sup>5</sup>
- `s` consists of English letters, digits, symbols and spaces.

**Hint 1**  
There are less than 100 unique characters. We can check all substrings with length at most 100 for example. This is a good enough approximation.