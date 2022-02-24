package baekjoon.problem.p2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 주사위 세개
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2480">https://www.acmicpc.net/problem/2480</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        String input = Algorithm.readLine();
        String[] split = input.split("\\s+");
        final int[] dices = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        int price = 0;
        if (dices[0] == dices[1] && dices[0] == dices[2] && dices[1] == dices[2]) {
            price = 10000 + dices[0] * 1000;
        } else if (dices[0] == dices[1] || dices[0] == dices[2]) {
            price = 1000 + dices[0] * 100;
        } else if (dices[1] == dices[2]) {
            price = 1000 + dices[1] * 100;
        } else {
            price = Math.max(dices[0], Math.max(dices[1], dices[2])) * 100;
        }

        System.out.println(price);
    }
}

/**
 * 백준에 제출하기 위해 문제의 Main 클래스로 복사 이동하여 사용됩니다.
 *
 * @author extreme code
 */
class Algorithm {
    @FunctionalInterface
    public interface Solution {
        void solve();
    }

    private static BufferedReader bufferedReader;

    public static String readLine() {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

    public static List<String> readLines(final int readCount) {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        List<String> lines = new ArrayList<>();
        try {
            int count = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
                ++count;
                if (count == readCount)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void close() {
        if (null == bufferedReader)
            return;
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader = null;
        }
    }

    public static void solve(Solution solution) {
        solution.solve();
        close();
    }
}