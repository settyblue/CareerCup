https://www.careercup.com/question?id=5174694727647232
------------------------------------------------------
Given a 2D matrix of integers, sort it such that: 

- every row is sorted in ascending order from left to right 
- every column is sorted in ascending order from top to down 
- all items in the same row are unique 

You may assume the input matrix is always valid, meaning that such a sort is always possible. 

For example: 
for input matrix


1 3 5
3 2 4
the output could be any of the following: 
valid output #1:


1 3 4
2 3 5
valid output #2:


1 2 3
3 4 5
valid output #3:


1 3 4
2 3 5
One kinda trivial solution is to sort the 2D matrix column wise. For example, you can push all items into a heap and pop one after another, putting it into the matrix column after column. This would be a `O(n lg n)` time complexity where `n` is the number of items in the matrix, i.e., `n = rows*cols`. Can you design a more efficient algorithm? 

Follow-up: What if all items in the same column are also required to be unique?
--------------------------------------
Solution:
1. Trivial Solution 
2. Efficient Solution by traversing diagonally in a matrix.