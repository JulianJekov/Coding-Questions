import java.util.HashMap;

public class _07_TwoSum {
    public static void main(String[] args) {
        int[] result1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indexes: " + result1[0] + ", " + result1[1]); // 0, 1

        int[] result2 = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Indexes: " + result2[0] + ", " + result2[1]); // 1, 2

        int[] result3 = twoSum(new int[]{1, 2, 3}, 10);
        if (result3.length == 0) {
            System.out.println("No such combination.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
