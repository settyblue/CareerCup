/**
 * https://www.careercup.com/question?id=5723915160649728
 * Given a list of integers, find the highest value obtainable by concatenating these together. 
 * 
 * For example:
 * Given 9, 918, 917 - The answer is 9918917. 
 * But given 1,112,113 - The answer is 1131121
 */

Solution
--------
Implmented by defining custom compare function for string and sorting the list of numbers based on this new comparator.