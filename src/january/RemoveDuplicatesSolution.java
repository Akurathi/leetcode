package january;

public class RemoveDuplicatesSolution {
    public int removeDuplicates(int[] nums) {
        int prevIndex = 0;
        for ( int index = 1; index<nums.length; index++) {
            if (nums[index] != nums[prevIndex]) {
                prevIndex++;
                nums[prevIndex] = nums[index];
            }
        }
        return prevIndex+1;
    }
}
