package baekjoon.problem.p11653;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 소인수분해
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11653">https://www.acmicpc.net/problem/11653</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        List<String> inputs = Algorithm.getInputs(1);
        int number = Integer.parseInt(inputs.get(0));
        int quotient = 2;
        StringJoiner output = new StringJoiner("\n");
        while (number != 1) {
            if (number % quotient == 0) {
                output.add(Integer.toString(quotient));
                number /= quotient;
            } else {
                quotient += 1;
            }
        }
        System.out.println(output);
    }
}

/**
 * 알고리즘 풀이 구조 클래스<p>
 * 백준에 제출하기 위해 해당 클래스 Main 클래스로 가져가서 사용합니다.
 *
 * @author extreme code
 */
class Algorithm {
    @FunctionalInterface
    public interface Solution {
        void solve();
    }

    public static List<String> getInputs(final int lineCount) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 0;
            String line;
            while ((line = buffer.readLine()) != null) {
                lines.add(line);
                ++count;
                if (count == lineCount)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void solve(Solution solution) {
        solution.solve();
    }
}

