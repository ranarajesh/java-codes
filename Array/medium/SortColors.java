package Array.medium;

public class SortColors {
    public int[] sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while (white <= blue) {

            if (nums[white] == 0) {

                if (nums[red] != 0) {
                    int temp = nums[red];
                    nums[red] = nums[white];
                    nums[white] = temp;
                }

                white++;
                red++;
            }

            else if (nums[white] == 1) {
                white++;
            }

            else {
                if (nums[blue] != 2) {
                    int temp = nums[white];
                    nums[white] = nums[blue];
                    nums[blue] = temp;
                }

                blue--;
            }
        }

        return nums;
    }
}
