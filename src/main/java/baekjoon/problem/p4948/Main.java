package baekjoon.problem.p4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 베르트랑 공준<p>
 * 에라토스테네스의 체
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4948">https://www.acmicpc.net/problem/4948</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final StringBuilder stringBuilder = new StringBuilder();
        final boolean[] isNotPrime = new boolean[123456 * 2 + 1];
        makePrimeNumber(isNotPrime);

        while (true) {
            final int N = Integer.parseInt(Algorithm.readLine());
            if (N == 0)
                break;

            int count = 0;
            for (int i = N + 1; i <= N * 2; ++i) {
                if (!isNotPrime[i]) {
                    ++count;
                }
            }
            stringBuilder.append(count).append("\n");
        }

        System.out.print(stringBuilder);
    }

    private static void makePrimeNumber(final boolean[] isNotPrime) {
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= isNotPrime.length; ++i) {
            for (int j = i * i; j < isNotPrime.length; j += i) {
                isNotPrime[j] = true;
            }
        }
    }
}

/**
 * Algorithm 클래스는 백준 문제의 Main 클래스로 복사 - 붙여넣기하여 사용합니다.
 *
 * @author extreme code
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
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