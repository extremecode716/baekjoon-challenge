package baekjoon.problem.p10870;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 피보나치 수 5
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10870">https://www.acmicpc.net/problem/10870</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            final String input = Algorithm.readLine();
            final int N = Integer.parseInt(input);
            bw.write(fibonacci(N) + "\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int fibonacci(final int N) {
        final int[] arr = new int[21];
        arr[1] = 1;
        for (int i = 2; i <= N; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[N];
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