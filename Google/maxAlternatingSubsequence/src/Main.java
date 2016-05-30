/**
 * https://www.careercup.com/question?id=5667564572114944
 * Given an array of numbers, find the longest alternating subsequence. 
 * That is, 
 * a subsequence [a1, a2, a3, ..., ak] where a1 > a2, a3 < a2, a4 > a3
 */

/**
 * @author rakshith
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] input = {1, 2, 51, 50, 60, 55, 70, 68, 80, 76, 75, 12, 45}; //MaxSubLen:9 (2, 51, 50, 60, 55, 70, 68, 80, 76)
        //int[] input = {1, 2, 51, 50, 45, 55, 54, 68, 66, 76, 75, 12, 45}; //MaxSubLen:8 (50, 45, 55, 54, 68, 66, 76, 75)
        //int[] input = {1, 2, 3, 4, 5, 6, 70}; //MaxSubLen:2 (1, 2)
        //int[] input = {1, 1, 1, 1, 1, 2}; //MaxSubLen: 2 (1, 2)
        //int[] input = {3, 3, 3, 3, 3, 2}; //MaxSubLen: 2 (3, 2)
        //int[] input = {1, 1, 1, 1, 1, 1}; //MaxSubLen: 1 (1)
        //int[] input = {50, 45, 51, 48, 62, 55, 73}; //MaxSubLen:7 (50, 45, 51, 48, 62, 55, 73)
        //int[] input = {1, 1, 1, 2, 1, 1, 1}; //MaxSubLen:3 (1, 2, 1)
        //int[] input = {2, 2, 2, 1, 2, 2, 2}; //MaxSubLen:3 (2, 1, 2)

		System.out.println("Length of maximum alternating subsequence is :"+maxAlternatingSubsequence(input));
	}

	private static int maxAlternatingSubsequence(int[] input) {
		if(input.length<=2){
			return input.length;
		}
		int a, b, c;
		int curLength=1, maxLength=0;
		
		//if(a!=b)curLength++;
		int i=0;
		while(i+2<input.length){
			a=input[i];b=input[i+1];c=input[i+2];
			if((a<b && b<c) || (a>b && b>c) || (a==b && b!=c)){
				curLength=1;
			}else if(b==c){
				curLength=0;
			}else{
				curLength++;
			}
			if(curLength>maxLength)maxLength=curLength;
			i++;
		}
		return maxLength+1;
	}

}
