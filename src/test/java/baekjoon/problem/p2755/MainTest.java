package baekjoon.problem.p2755;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 이번학기 평점은 몇점?
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2755">https://www.acmicpc.net/problem/2755</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "7\n" +
                "General_Physics_1 3 A+\n" +
                "Introduction_to_Computer_Science_and_Eng 3 B0\n" +
                "Reading_And_Writing 2 C0\n" +
                "English_1 3 C+\n" +
                "Analytic_Geometry_and_Calculus_1 3 B+\n" +
                "Fortran_Programming 3 B+\n" +
                "C_Language_Programming 3 A+";
        String output = "3.28";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}