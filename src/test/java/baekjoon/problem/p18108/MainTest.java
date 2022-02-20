package baekjoon.problem.p18108;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 1998년생인 내가 태국에서는 2541년생?!
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/18108">https://www.acmicpc.net/problem/18108</a>
 */
class MainTest {

    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2541";
        String output = "1998";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}