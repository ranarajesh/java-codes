// Importing required functions
import java.util.*;

class RotateArray {
	static void rotateArray(List<Integer> nums, int n) {
		int len = nums.size();

		// Let's normalize rotations
		n = n % len;
		if (n < 0) {
			n = n + len;
		}

		List<Integer> temp = new ArrayList<Integer>();

		// copy last 'n' elements of array into temp
		for (int i = len - n; i < len; i++) {
			temp.add(nums.get(i));
		}

		// shift original array
		for (int i = len - 1; i >= n; i--) {
			nums.set(i, nums.get(i - n));
		}

		// copy temp into original array
		for (int i = 0; i < n; i++) {
			nums.set(i, temp.get(i));
		}
	}

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 10, 20, 0, 59, 86, 32, 11, 9, 40);
		System.out.println("Array Before Rotation\n" + nums);
		rotateArray(nums, -3);
		System.out.println("Array After -3 Rotations\n" + nums);
	}
}
