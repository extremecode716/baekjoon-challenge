package baekjoon.problem.p2447;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 별 찍기 - 10
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2447">https://www.acmicpc.net/problem/2447</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            final String input = Algorithm.readLine();
            final int N = Integer.parseInt(input);
            final char[][] square = new char[N][N];
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    square[i][j] = ' ';
                }
            }
            star(square, 0, 0, N);
            for (char[] chars : square) {
                for (char ch : chars) {
                    bw.write(ch);
                }
                bw.write('\n');
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void star(char[][] square, int x, int y, int N) {
        if (N == 1) {
            square[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    star(square, x + i * (N / 3), y + j * (N / 3), N / 3);
                }
            }
        }
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