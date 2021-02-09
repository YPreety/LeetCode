package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] data = { 1,0,2,3,0,4,5,0 }; // o/p : [1,0,0,2,3,0,0,4] 
		duplicate(data);
		for (int i : data) {
			System.out.print(i + ", ");
		}

	}

	public static void duplicate(int[] arr) {

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			queue.add(arr[i]);
		}

		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp = queue.poll();
			if (temp == 0) {
				arr[i] = temp;
				if (i + 1 < arr.length) {
					arr[i + 1] = temp;
					i++;
				}
			} else {
				arr[i] = temp;
			}
		}
	}

}
