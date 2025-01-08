package january;

public class RemoveDuplicatesSolutionII {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 0;
        int count = 1;
        for (int index = 1; index<nums.length; index++) {
            if (count < 2 && nums[index] == nums[prevIndex]) {
                prevIndex++;
                count++;
                nums[prevIndex] = nums[index];
            }
            else if (count > 2) {
                continue;
            }
            else if (nums[index] != nums[prevIndex]) {
                prevIndex++;
                nums[prevIndex] = nums[index];
                count = 1;
            }
        }
        return prevIndex+1;
    }
}
