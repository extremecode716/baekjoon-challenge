package baekjoon.problem.p1620;

import baekjoon.BaekjoonTest;
import org.junit.jupiter.api.Test;

/**
 * 나는야 포켓몬 마스터 이다솜
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1620">https://www.acmicpc.net/problem/1620</a>
 */
class MainTest {
    private static void main() {
        Main.main(new String[0]);
    }

    @Test
    void testCase1() {
        String input = "26 5\n" +
                "Bulbasaur\n" +
                "Ivysaur\n" +
                "Venusaur\n" +
                "Charmander\n" +
                "Charmeleon\n" +
                "Charizard\n" +
                "Squirtle\n" +
                "Wartortle\n" +
                "Blastoise\n" +
                "Caterpie\n" +
                "Metapod\n" +
                "Butterfree\n" +
                "Weedle\n" +
                "Kakuna\n" +
                "Beedrill\n" +
                "Pidgey\n" +
                "Pidgeotto\n" +
                "Pidgeot\n" +
                "Rattata\n" +
                "Raticate\n" +
                "Spearow\n" +
                "Fearow\n" +
                "Ekans\n" +
                "Arbok\n" +
                "Pikachu\n" +
                "Raichu\n" +
                "25\n" +
                "Raichu\n" +
                "3\n" +
                "Pidgey\n" +
                "Kakuna";
        String output = "Pikachu\n" +
                "26\n" +
                "Venusaur\n" +
                "16\n" +
                "14";

        BaekjoonTest.MainTest(input, output, MainTest::main);
        BaekjoonTest.printRuntime();
    }

}