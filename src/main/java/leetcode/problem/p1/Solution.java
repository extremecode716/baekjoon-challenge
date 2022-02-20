package leetcode.problem.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Two Sum
 *
 * @author extreme code
 * @see <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i]))
                return new int[]{map.get(nums[i]), i};
            map.put(target - nums[i], i);
        }

        return new int[0];
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] output = new int[]{0, 0};
        ArrayNumber[] arrayNumbers = new ArrayNumber[nums.length];
        int index = 0;
        for (int num : nums) {
            arrayNumbers[index] = new ArrayNumber(num, index);
            ++index;
        }
        Arrays.sort(arrayNumbers);

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                final int twoSum = arrayNumbers[i].getNumber() + arrayNumbers[j].getNumber();
                if (twoSum > target) {
                    break;
                } else if (twoSum == target) {
                    output[0] = arrayNumbers[i].getIndex();
                    output[1] = arrayNumbers[j].getIndex();
                    Arrays.sort(output);

                    return output;
                }
            }
        }
        return output;
    }
}

class ArrayNumber implements Comparable<ArrayNumber> {
    private int number;
    private int index;

    public ArrayNumber(int number, int index) {
        this.number = number;
        this.index = index;
    }

    public int getNumber() {
        return number;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int compareTo(ArrayNumber o) {
        return getNumber() - o.getNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayNumber that = (ArrayNumber) o;
        return number == that.number && index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, index);
    }
}