class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int count = 0;
        int prev = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (prev == arr[i]) {
                count++;
            }
            else {
                if (map.containsKey(count)) {
                    return false;
                }
                map.put(count, prev);
                count = 1;
                prev = arr[i];
            }
            if (i+1 == arr.length) {
                if (map.containsKey(count)) {
                    return false;
                }
                map.put(count, prev);
            }
        }
        return true;
    }
}
