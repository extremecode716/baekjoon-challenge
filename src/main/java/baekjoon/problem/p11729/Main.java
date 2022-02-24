package baekjoon.problem.p11729;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 하노이 탑 이동 순서
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/11729">https://www.acmicpc.net/problem/11729</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static int count = 0;
    private static final StringBuilder stringBuilder = new StringBuilder();

    private static void solution() {
        final String input = Algorithm.readLine();
        final int N = Integer.parseInt(input);
        count = 0;
        stringBuilder.setLength(0);
        towerOfHanoi(N, 1, 2, 3);
        System.out.println(count);
        System.out.print(stringBuilder);
    }

    public static void towerOfHanoi(int number, int from, int middle, int to) {
        if (number == 0)
            return;
        towerOfHanoi(number - 1, from, to, middle);
        stringBuilder.append(from).append(" ").append(to).append("\n");
        ++count;
        towerOfHanoi(number - 1, middle, from, to);
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