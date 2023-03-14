package Medium;

public class LeetCode_167_TwoSum2_TwoPointer {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;

        while (low < high) {

            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            } else if (numbers[low] + numbers[high] > target) {
                high--;
            } else {
                low++;
            }
        }

        return new int[]{0};
    }
}
