https://www.careercup.com/question?id=5648257217724416
http://www.geeksforgeeks.org/nearly-sorted-algorithm/
/**
 * A list L is too big to fit in memory. L is partially sorted. 
 * Partially sorted in a specific way: 
 * x-sorted L[i] < L[i+x]. 
 * Any element is at most x indices out of position. 
 * You can look at the condition in a different way too.. 
 * L[i] >= L[i-x]
 *
 * Sort the list L.
 */

 Solution:
 ---------
 Create a min heap of size k+1.
 keep polling elements from queue to sorted list.