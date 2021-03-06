package arrays;

import java.util.Arrays;

public class SortedSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { -4, -1, 0, 3, 10 }; // o/p := 0 , 1, 9, 16, 100
		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] * num[i];
		}
		Arrays.sort(num);
		for(int i = 0 ; i < num.length ; i++){
			System.out.print(num[i] + " ");
		}
		
	}

}

// other solution
class Solution {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}