package baekjoon.problem.p3009;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 네 번째 점
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/3009">https://www.acmicpc.net/problem/3009</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        List<String> inputs = Algorithm.getInputs(3);

        Set<String> xSet = new HashSet<>();
        Set<String> ySet = new HashSet<>();
        for (String input : inputs) {
            String[] split = input.split("\\s+");
            if (xSet.contains(split[0]))
                xSet.remove(split[0]);
            else
                xSet.add(split[0]);

            if (ySet.contains(split[1]))
                ySet.remove(split[1]);
            else
                ySet.add(split[1]);
        }

        StringJoiner output = new StringJoiner(" ");
        for (String x : xSet) {
            output.add(x);
        }
        for (String y : ySet) {
            output.add(y);
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

