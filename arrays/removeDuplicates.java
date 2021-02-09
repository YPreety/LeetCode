package arrays;

public class removeDuplicates {

	public static void main(String[] args) {
		int num[] = { 1, 1, 2 }; // o/p := 1,2
		int len = num.length;
		len = duplicate(num, len);
		for (int i = 0; i < len; i++) {
			System.out.print(num[i] + " " );
		}
	}

	private static int duplicate(int[] num, int len) {
		int temp[] = new int[len];
		int j = 0;
		for (int i = 0; i < len - 1; i++) {
			if (num[i] != num[i + 1]) {
				temp[j++] = num[i];
			} 
		}
		temp[j++] = num[len - 1];
		for (int i = 0; i < j; i++) {
			num[i] = temp[i];
		}
		return j;
	}

}
