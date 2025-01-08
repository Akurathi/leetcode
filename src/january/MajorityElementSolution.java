package january;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        int maxCount = nums.length/2;
        Map<Integer, Integer> valueCountMap = new HashMap<>();

        for (int val: nums) {
            valueCountMap.compute(val, (k, v) -> valueCountMap.getOrDefault(k, 0) + 1);
        }

        for (int val: valueCountMap.keySet()) {
            if (valueCountMap.get(val) > maxCount) {
                return val;
            }
        }
        return 0;
    }
}
