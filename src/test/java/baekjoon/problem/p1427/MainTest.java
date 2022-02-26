package baekjoon.problem.p1427;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 소트인사이드
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1427">https://www.acmicpc.net/problem/1427</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "2143";
        String output = "4321";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "999998999";
        String output = "999999998";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase3() {
        String input = "61423";
        String output = "64321";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase4() {
        String input = "500613009";
        String output = "965310000";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}