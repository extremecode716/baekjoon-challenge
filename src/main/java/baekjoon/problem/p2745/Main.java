package baekjoon.problem.p2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 진법 변환
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2745">https://www.acmicpc.net/problem/2745</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final List<String> inputs = Algorithm.readLines(1);
        final String[] split = inputs.get(0).split("\\s+");
        final String B = split[0];
        final int N = Integer.parseInt(split[1]);

        int sum = convertBNotationToDecimal(B.charAt(B.length() - 1), N);
        for (int i = B.length() - 2, power = 1; i > -1; --i, ++power) {
            sum += Math.pow(N, power) * convertBNotationToDecimal(B.charAt(i), N);
        }

        System.out.println(sum);
    }

    private static int convertBNotationToDecimal(final char BCharAt, final int N) {
        int number;
        if (BCharAt - '9' <= 0) {
            number = BCharAt - '0';
        } else {
            number = BCharAt - 'A' + 10;
        }
        return number;
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