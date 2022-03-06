package baekjoon.problem.p4386;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 별자리 만들기 <p>
 * 메모리 최적화 이전 풀이<p>
 * 알고리즘 분류: 그래프 이론, 최소 스패닝 트리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4386">https://www.acmicpc.net/problem/4386</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class Main1Test {
    private static void main() {
        Main1.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "3\n" +
                "1.0 1.0\n" +
                "2.0 2.0\n" +
                "2.0 4.0";
        String output = "3.41";

        BaekjoonTest.MainTest(input, output, Main1Test::main);
        BaekjoonTest.printRuntime();
    }

    @Test
    void testCase2() {
        String input = "4\n" +
                "1.0 1.0\n" +
                "2.0 2.0\n" +
                "2.0 3.0\n" +
                "2.0 4.0";
        String output = "3.41";

        BaekjoonTest.MainTest(input, output, Main1Test::main);
        BaekjoonTest.printRuntime();
    }


    @Test
    void testCase3() {
        String input = "6\n" +
                "4 1\n" +
                "5 8\n" +
                "2 1\n" +
                "8 4\n" +
                "2 9\n" +
                "1 4";
        String output = "18.32";

        BaekjoonTest.MainTest(input, output, Main1Test::main);
        BaekjoonTest.printRuntime();
    }
}