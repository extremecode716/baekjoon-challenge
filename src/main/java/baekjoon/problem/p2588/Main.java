package baekjoon.problem.p2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 곱셈
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2588">https://www.acmicpc.net/problem/2588</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final List<String> inputs = Algorithm.readLines(2);
        final int number1 = Integer.parseInt(inputs.get(0));
        final int number2 = Integer.parseInt(inputs.get(1));

        final StringBuilder stringBuilder = new StringBuilder();
        final int[] eachDigit = convertNumberToEachDigit(number2);
        for (int i = 0; i < eachDigit.length; ++i) {
            stringBuilder.append(number1 * eachDigit[i]).append("\n");
        }
        stringBuilder.append(number1 * number2);

        System.out.println(stringBuilder);
    }

    private static int[] convertNumberToEachDigit(int number) {
        final int length = (int) Math.log10(number) + 1;
        int[] result = new int[length];

        for (int i = 0; i < length; ++i) {
            result[i] = number % 10;
            number /= 10;
        }
        return result;
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