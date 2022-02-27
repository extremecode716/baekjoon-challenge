package baekjoon.problem.p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 단어 공부
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1157">https://www.acmicpc.net/problem/1157</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final String input = Algorithm.readLine();
        final int[] alphabet = new int['Z' - 'A' + 1];

        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < input.length(); ++i) {
            maxCount = Math.max(maxCount, ++alphabet[Character.toUpperCase(input.charAt(i)) - 'A']);
        }

        int countOfMaxCount = 0;
        char maxUsedAlphabet = 0;
        for (int i = 0; i < alphabet.length; ++i) {
            if (alphabet[i] == maxCount) {
                ++countOfMaxCount;
                maxUsedAlphabet = (char) ('A' + i);
                if (countOfMaxCount > 1) {
                    maxUsedAlphabet = '?';
                    break;
                }
            }
        }

        System.out.println(maxUsedAlphabet);
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