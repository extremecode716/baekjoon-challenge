package baekjoon.problem.p1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 단어 정렬
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1181">https://www.acmicpc.net/problem/1181</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int N = Integer.parseInt(Algorithm.readLine());
        final List<String> inputs = Algorithm.readLines(N);
        final Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() > o2.length())
                return 1;
            else if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return -1;
        };

        Collections.sort(inputs, comparator);

        final StringBuilder stringBuilder = new StringBuilder();
        String beforeString = "";
        for (String input : inputs) {
            if (!input.equals(beforeString)) {
                stringBuilder.append(input).append("\n");
            }
            beforeString = input;
        }
        System.out.print(stringBuilder);
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