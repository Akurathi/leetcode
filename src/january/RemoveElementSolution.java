package january;

class RemoveElementSolution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int length = nums.length;
        for (int i=0; i<length; ) {
            if (nums[i] == val) {
                swap(nums, i, val);
            }
            i++;
        }
        return countNumber(nums, val);
    }

    private int countNumber(int[] nums, int val) {
        int count = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        return nums.length - count;
    }

    private void swap(int[] nums, int index, int val) {
        Integer lastIndex = getLastIndex(nums, val);
        if (lastIndex != null && lastIndex > index) {
            nums[index] = nums[lastIndex];
            nums[lastIndex] = val;
        }
    }

    private Integer getLastIndex(int[] nums, int val) {
        for (int i = nums.length-1; i>=0; i--) {
            if (nums[i] != val) {
                return i;
            }
        }
        return null;
    }


}
