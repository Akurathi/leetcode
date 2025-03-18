class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> num2Set = new HashSet<>();

        for (int i: nums1) num1Set.add(i);
        for (int i: nums2) num2Set.add(i);

        for (int i: nums2) {
            if (num1Set.contains(i)) {
                num1Set.remove(i);
                num2Set.remove(i);
            }
        }

        result.add(new ArrayList<>(num1Set));
        result.add(new ArrayList<>(num2Set));

        return result;

    }
}
