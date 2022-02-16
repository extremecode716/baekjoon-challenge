package baekjoon.problem.p10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * ACM 호텔
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10250">https://www.acmicpc.net/problem/10250</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final List<String> inputs = Algorithm.readLines(Integer.parseInt(Algorithm.readLine()));
        final StringJoiner output = new StringJoiner("\n");
        for (String input : inputs) {
            String[] split = input.split("\\s+");

            int H = Integer.parseInt(split[0]);
            int N = Integer.parseInt(split[2]);

            int YY;
            int XX;
            if (0 == N % H) {
                YY = H;
                XX = N / H;
            } else {
                YY = N % H;
                XX = N / H + 1;
            }

            String roomNumber = String.format("%d%02d", YY, XX);
            output.add(roomNumber);
        }

        System.out.println(output);
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