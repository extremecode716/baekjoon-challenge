package baekjoon.problem.p1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 한수
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1065">https://www.acmicpc.net/problem/1065</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int N = Integer.parseInt(Algorithm.readLine());

        int count = 0;
        for (int i = 1; i <= N; ++i) {
            if (i <= 99) {
                ++count;
            } else {
                String[] split = String.valueOf(i).split("");
                int beforeNumber = 0;
                boolean isArithmeticSequence = true;
                for (int j = 1; j < split.length; ++j) {
                    if (j != 1) {
                        if (!(beforeNumber == Integer.parseInt(split[j]) - Integer.parseInt(split[j - 1]))) {
                            isArithmeticSequence = false;
                            break;
                        }
                    }
                    beforeNumber = Integer.parseInt(split[j]) - Integer.parseInt(split[j - 1]);
                }
                if (isArithmeticSequence)
                    ++count;
            }
        }
        System.out.println(count);
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