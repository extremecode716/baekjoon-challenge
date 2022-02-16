package leetcode.problem.p1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Two Sum
 *
 * @author extreme code
 * @see <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>
 */
class SolutionTest {
    @Test
    void testCase1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] output = new int[]{0, 1};

        assertThat(new Solution().twoSum(nums, target)).isEqualTo(output);
    }

    @Test
    void testCase2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] output = new int[]{1, 2};

        assertThat(new Solution().twoSum(nums, target)).isEqualTo(output);
    }

    @Test
    void testCase3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] output = new int[]{0, 1};

        assertThat(new Solution().twoSum(nums, target)).isEqualTo(output);
    }

    @Test
    void testCase4() {
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int target = -8;
        int[] output = new int[]{2, 4};

        assertThat(new Solution().twoSum(nums, target)).isEqualTo(output);
    }
}