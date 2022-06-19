package baekjoon.problem.p4447;


import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 좋은놈 나쁜놈<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4447">https://www.acmicpc.net/problem/4447</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "8\n" +
                "Algorithm Crunching Man\n" +
                "Green Lantern\n" +
                "Boba Fett\n" +
                "Superman\n" +
                "Batman\n" +
                "Green Goblin\n" +
                "Barney\n" +
                "Spider Pig";
        String output = "Algorithm Crunching Man is GOOD\n" +
                "Green Lantern is GOOD\n" +
                "Boba Fett is A BADDY\n" +
                "Superman is NEUTRAL\n" +
                "Batman is A BADDY\n" +
                "Green Goblin is GOOD\n" +
                "Barney is A BADDY\n" +
                "Spider Pig is GOOD";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }
}