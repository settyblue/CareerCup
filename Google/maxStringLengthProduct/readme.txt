/**
 * https://www.careercup.com/question?id=5113734827606016
 * Given an array of words (i.e. ["ABCW", "BAZ", "FOO", "BAR", "XTFN", 
 * "ABCDEF"]), find the max value of length(s) * length(t), 
 * where s and t are words from the array. 
 * The catch here is that the two words cannot share any characters. 
 * 
 * Assume that there are many words in the array (N words) 
 * and average length of word is M. 
 * Answer for the example above is "ABCW" and "XTFN" as the result 
 * is 4 * 4 = 12. 
 *
 * "ABCW" and "ABCDEF" do not work since they share similar characters.
 */
 
 Solution 1:
 -----------
 Using brute force method.
 used character hashset and then compared different hashes to see common characters between string.

 Solution 2:
 -----------
 Implemented using bit vector.